package io.aeon.experiment.mu;

import io.horizon.eon.em.typed.DataFormat;
import io.horizon.specification.modeler.HAttribute;
import io.modello.atom.normalize.KMarkAttribute;
import io.modello.atom.normalize.RRule;
import io.modello.eon.em.Marker;
import io.modello.specification.meta.HMetaField;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class KAttribute implements HAttribute, Serializable {
    private final DataFormat format;

    private final List<HMetaField> shapes = new ArrayList<>();

    private final HMetaField type;
    private final KMarkAttribute tag;
    private RRule rule;

    /*
     * Data Structure of Matrix
     * {
     *     "name",
     *     "alias",
     *     "type",
     *     "format": "JsonArray, JsonObject, Elementary",
     *     "fields": [
     *         {
     *              "field": "",
     *              "alias": "",
     *              "type": "null -> String.class | ???"
     *         }
     *     ],
     *     "rule": {
     *     }
     * }
     */
    public KAttribute(final JsonObject config, final KMarkAttribute tag) {
        this.tag = tag;
        /*
         * Extract DataFormat from `format` field in config，
         * Here are format adjustment:
         * 1. Priority 1: isArray = true, the format is `JsonArray`.
         * 2. Priority 2: isArray = false, set the default value instead ( Elementary )
         */
        DataFormat format = Ut.toEnum(() -> config.getString(KName.FORMAT), DataFormat.class, DataFormat.Elementary);
        if (tag.value(Marker.array)) {
            format = DataFormat.JsonArray;
        }
        this.format = format;

        /*
         * Here the type must be fixed or null
         */
        final Class<?> type = Ut.clazz(config.getString(KName.TYPE), String.class);
        final String name = config.getString(KName.NAME);
        final String alias = config.getString(KName.ALIAS);
        this.type = HMetaField.of(name, alias, type);

        /*
         * Format is not elementary, expand the `fields` lookup range
         * instead of simple, then add children into HTField for complex
         */
        if (DataFormat.Elementary != format) {
            final JsonArray fields = Ut.valueJArray(config.getJsonArray(KName.FIELDS));
            Ut.itJArray(fields).forEach(item -> {
                final String field = item.getString(KName.FIELD);
                if (Ut.isNotNil(field)) {
                    final String fieldAlias = item.getString(KName.ALIAS, null);
                    final Class<?> subType = Ut.clazz(item.getString(KName.TYPE), String.class);
                    this.shapes.add(HMetaField.of(field, fieldAlias, subType));
                }
            });
            this.type.add(this.shapes);
        }

        /*
         * Bind `rule` processing, the `rule` should be configured in config instead of
         */
        if (config.containsKey(KName.RULE)) {
            final JsonObject ruleJ = Ut.valueJObject(config, KName.RULE);
            this.rule = Ut.deserialize(ruleJ, RRule.class);
            /* Bind type into rule */
            this.rule.type(this.type.type());
            /* Unique rule for diffSet */
            this.type.key(this.rule.getUnique());
            // this.type.?uleUnique(this.rule.getUnique());
        }
    }

    @Override
    public RRule referenceRule() {
        return this.rule;
    }

    @Override
    public KMarkAttribute marker() {
        return this.tag;
    }

    @Override
    public DataFormat format() {
        return this.format;
    }

    @Override
    public HMetaField field() {
        return this.type;
    }

    @Override
    public List<HMetaField> fields() {
        return this.shapes;
    }
}
