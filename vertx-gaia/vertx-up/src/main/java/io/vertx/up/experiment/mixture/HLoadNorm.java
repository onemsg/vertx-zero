package io.vertx.up.experiment.mixture;

import io.vertx.up.exception.web._404ModelNotFoundException;
import io.vertx.up.exception.web._409IdentifierConflictException;
import io.vertx.up.experiment.shape.internal.NormAtom;
import io.vertx.up.experiment.shape.internal.NormPerformer;
import io.vertx.up.experiment.specification.KApp;
import io.vertx.up.log.Annal;
import io.vertx.up.uca.cache.Cc;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class HLoadNorm implements HLoad {
    private static final Annal LOGGER = Annal.get(HLoadNorm.class);
    private static final Cc<String, HPerformer<HModel>> CC_PERFORMER = Cc.open();
    private static final Cc<String, HModel> CC_MODEL = Cc.open();
    private static final Cc<String, KApp> CC_APP = Cc.open();

    @Override
    public HAtom atom(final String appName, final String identifier) {
        try {
            /*
             * Performer processing to expose exception
             */
            final String ns = HApp.ns(appName);
            final String unique = HApp.ns(appName, identifier);
            final HPerformer<HModel> performer = CC_PERFORMER.pick(() -> new NormPerformer(ns), ns);
            final HModel model = CC_MODEL.pick(() -> performer.fetch(identifier), unique);
            // Internal Object to store application information
            // -- sigma
            // -- language
            // -- appName
            // -- ns
            final KApp app = CC_APP.pick(() -> new KApp(appName), appName);
            final HAtom atom = new NormAtom(model, app);
            LOGGER.info("Model ( Norm ) Information：<namespace>.<identifier> = {0}, model = {1}", unique, model.toJson().encode());
            return atom;
        } catch (final _404ModelNotFoundException | _409IdentifierConflictException ignored) {
            /*
             * 这里的改动主要基于动静态模型同时操作导致，如果可以找到Model则证明模型存在于系统中，这种
             * 情况下可直接初始化DataAtom走标准流程，否则直接返回null引用，使得系统无法返回正常模型，
             * 但不影响模型本身的执行。
             */
            return null;
        }
    }
}
