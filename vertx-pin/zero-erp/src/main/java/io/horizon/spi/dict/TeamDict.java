package io.horizon.spi.dict;

import cn.vertxup.erp.domain.tables.daos.ETeamDao;
import io.horizon.spi.component.DictionaryPlugin;
import io.vertx.core.Future;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonArray;
import io.vertx.up.commune.exchange.DSource;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

/*
 * Dict for `resource.companys` here
 */
public class TeamDict implements DictionaryPlugin {

    @Override
    public Future<JsonArray> fetchAsync(final DSource source,
                                        final MultiMap paramMap) {
        final String sigma = paramMap.get(KName.SIGMA);
        if (Ut.isNotNil(sigma)) {
            return Ux.Jooq.on(ETeamDao.class)
                .fetchAsync(KName.SIGMA, sigma)
                .compose(Ux::futureA);
        } else {
            return Ux.future(new JsonArray());
        }
    }
}
