package io.vertx.tp.workflow.uca.component;

import cn.vertxup.workflow.domain.tables.pojos.WTicket;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.tp.optic.business.ExLink;
import io.vertx.tp.workflow.atom.ConfigLinkage;
import io.vertx.tp.workflow.atom.WRecord;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class KtLinkage {

    private final transient ConfigLinkage configLinkage;

    KtLinkage(final ConfigLinkage configLinkage) {
        this.configLinkage = configLinkage;
    }

    Future<WRecord> syncAsync(final JsonObject params, final WRecord record) {
        /*
         * Linkage Sync based on configuration
         */
        final WTicket ticket = record.ticket();
        if (Objects.isNull(ticket) || Objects.isNull(this.configLinkage)) {
            return Ux.future(record);
        }
        final ConcurrentMap<String, Future<JsonArray>> futures = new ConcurrentHashMap<>();
        this.configLinkage.fields().forEach(field -> {
            /*
             * Data Array extract from `params` based on `field`
             */
            final JsonArray linkageData = this.buildData(params, field, ticket);
            if (Ut.notNil(linkageData)) {
                /*
                 * Build condition based on
                 * DEFAULT
                 * - sourceKey = key
                 *
                 * CONFIGURATION
                 * - targetType
                 * - sourceType
                 */
                final String sourceKey = ticket.getKey();
                final JsonObject condition = this.configLinkage.condition(field);
                condition.put(KName.SOURCE_KEY, sourceKey);
                futures.put(field, this.buildEach(condition, linkageData));
            }
        });
        return Ux.thenCombine(futures).compose(dataMap -> {
            dataMap.forEach(record::linkage);
            return Ux.future(record);
        });
    }

    private JsonArray buildData(final JsonObject params, final String field, final WTicket ticket) {
        final JsonArray linkageData = Ut.sureJArray(params, field);
        /*
         * When add new linkage for saving, here provide additional
         * - sourceKey
         * - sourceData
         *
         * Metadata Fields
         */
        final JsonObject sourceData = Ux.toJson(ticket);
        Ut.itJArray(linkageData).forEach(json -> {
            if (json.containsKey(KName.SOURCE_KEY)) {
                // Updated
                json.put(KName.SOURCE_KEY, ticket.getKey());
            } else {
                // Created
                json.put(KName.CREATED_BY, params.getValue(KName.UPDATED_BY));
            }
            Ut.jsonCopy(json, params,
                KName.UPDATED_BY,
                KName.ACTIVE,
                KName.LANGUAGE,
                KName.SIGMA
            );

            // Updated source data
            json.put("sourceData", sourceData);

            // Auditor Part
            json.put(KName.UPDATED_BY, params.getValue(KName.UPDATED_BY));
            json.put(KName.UPDATED_AT, params.getValue(KName.UPDATED_AT));
        });
        return linkageData;
    }

    private Future<JsonArray> buildEach(final JsonObject condition, final JsonArray data) {
        /*
         * Exclude the data stored in database here
         */
        final JsonArray keys = Ut.toJArray(Ut.itJArray(data)
            .map(json -> json.getString(KName.KEY))
            .filter(Ut::notNil)
            .collect(Collectors.toSet()));
        condition.put("key,!i", keys);
        return Ke.channelAsync(ExLink.class, Ux::futureA, (link) ->
            // Linkage Processing build for Each
            link.unlink(condition).compose(deleted -> link.link(data, false))
        );
    }
}
