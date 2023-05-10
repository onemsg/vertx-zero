package io.vertx.tp.plugin.session;

import io.horizon.uca.cache.Cc;
import io.vertx.core.Vertx;
import io.vertx.up.annotations.Plugin;
import io.vertx.up.plugin.Infix;
import io.vertx.up.runtime.ZeroYml;

import java.util.Objects;

@Plugin
@SuppressWarnings("unchecked")
public class SessionInfix implements Infix {

    private static final String NAME = "ZERO_SESSION_POOL";
    private static final Cc<String, SessionClient> CC_CLIENTS = Cc.open();

    private static void initInternal(final Vertx vertx,
                                     final String name) {
        getOrCreate(vertx, name);
    }

    public static void init(final Vertx vertx) {
        initInternal(vertx, NAME);
    }

    public static SessionClient getClient() {
        return CC_CLIENTS.store(NAME);
    }

    public static SessionClient getOrCreate(final Vertx vertx) {
        return getOrCreate(vertx, NAME);
    }

    private static SessionClient getOrCreate(final Vertx vertx, final String name) {
        final SessionClient client = CC_CLIENTS.store(name);
        if (Objects.isNull(client)) {
            /* Null will create new */
            return CC_CLIENTS.pick(() -> Infix.init(ZeroYml.inject.session,
                (config) -> SessionClient.createShared(vertx, config),
                SessionInfix.class
            ), name);
        } else {
            /*
             * Not null, it will get previous reference
             */
            return client;
        }
    }

    @Override
    public SessionClient get() {
        return getClient();
    }
}
