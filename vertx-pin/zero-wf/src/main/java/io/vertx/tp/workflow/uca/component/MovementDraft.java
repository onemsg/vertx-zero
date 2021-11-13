package io.vertx.tp.workflow.uca.component;

import cn.vertxup.workflow.domain.tables.pojos.WInstance;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.uca.runner.ProcOn;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class MovementDraft extends AbstractTransfer implements Movement {
    @Override
    public Future<WInstance> moveAsync(final JsonObject params) {
        // Extract workflow parameters
        final JsonObject workflow = params.getJsonObject(KName.Flow.WORKFLOW);
        // Engine Connect
        final ProcOn proc = ProcOn.get();
        return Ux.future();
    }
}
