package io.vertx.tp.workflow.uca.component;

import cn.vertxup.workflow.domain.tables.pojos.WInstance;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class MovementEmpty extends AbstractTransfer implements Movement {
    @Override
    public Future<WInstance> moveAsync(final JsonObject params) {
        return Ux.future();
    }
}
