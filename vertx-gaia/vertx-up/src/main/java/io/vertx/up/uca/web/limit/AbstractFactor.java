package io.vertx.up.uca.web.limit;

import io.horizon.uca.log.Annal;
import io.vertx.tp.error.RpcPreparingException;
import io.vertx.up.eon.em.container.ServerType;
import io.vertx.up.fn.Fn;
import io.vertx.up.runtime.ZeroHeart;
import io.vertx.up.runtime.ZeroMotor;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public abstract class AbstractFactor implements Factor {

    @Override
    public ConcurrentMap<ServerType, Class<?>> agents() {

        /* 1.Find Agent for deploy **/
        final ConcurrentMap<ServerType, Class<?>> agentMap = this.internals();
        final ConcurrentMap<ServerType, Class<?>> agents
            = ZeroMotor.agents(ServerType.HTTP, this.defaults(), agentMap);
        if (agents.containsKey(ServerType.IPC)) {
            // 2. Check etcd server status, IPC Only
            Fn.outBoot(!ZeroHeart.isEtcd(),
                this.logger(), RpcPreparingException.class, this.getClass());
        }
        // 3. Filter invalid agents
        final Set<ServerType> scanned = new HashSet<>(agents.keySet());
        final Set<ServerType> keeped = agentMap.keySet();
        scanned.removeAll(keeped);
        scanned.forEach(agents::remove);
        return agents;
    }

    public abstract Class<?>[] defaults();

    public abstract ConcurrentMap<ServerType, Class<?>> internals();

    private Annal logger() {
        return Annal.get(this.getClass());
    }
}
