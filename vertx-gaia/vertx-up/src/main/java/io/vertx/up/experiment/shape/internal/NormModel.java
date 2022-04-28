package io.vertx.up.experiment.shape.internal;

import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.em.atom.ModelType;
import io.vertx.up.experiment.mixture.HAttribute;
import io.vertx.up.experiment.mu.KClass;
import io.vertx.up.experiment.rule.RuleUnique;
import io.vertx.up.experiment.shape.AbstractHModel;

import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class NormModel extends AbstractHModel {

    private final KClass kClass;

    public NormModel(final String namespace, final String identifier) {
        super(namespace);
        this.kClass = KClass.create(namespace, identifier);
    }

    @Override
    public JsonObject toJson() {
        return null;
    }

    @Override
    public void fromJson(final JsonObject json) {

    }

    @Override
    public ModelType type() {
        return null;
    }

    @Override
    protected ConcurrentMap<String, HAttribute> loadAttribute() {
        return null;
    }

    @Override
    protected RuleUnique loadRule() {
        return null;
    }
}
