package io.vertx.tp.workflow.uca.ticket;

import io.vertx.tp.workflow.atom.configuration.MetaInstance;

public abstract class AbstractSync implements Sync {
    protected final transient MetaInstance metadata;

    public AbstractSync(final MetaInstance metadata) {
        this.metadata = metadata;
    }
}
