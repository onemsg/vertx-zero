package io.vertx.up.quiz;

import io.vertx.quiz.ZeroBase;
import io.vertx.tp.plugin.jooq.JooqInfix;
import io.vertx.up.uca.di.DiPlugin;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public abstract class JooqBase extends ZeroBase {
    static {
        JooqInfix.init(VERTX);
    }

    protected <T> T component(final Class<?> clazz) {
        final DiPlugin plugin = DiPlugin.create(this.getClass());
        return plugin.createComponent(clazz);
    }
}
