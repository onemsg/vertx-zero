package io.aeon.atom.iras;

import io.aeon.atom.config.HPlot;
import io.aeon.eon.HName;
import io.aeon.eon.HPath;
import io.aeon.eon.em.AeonMode;
import io.aeon.eon.em.AeonRuntime;
import io.aeon.runtime.CRunning;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.runtime.env.MatureOn;
import io.vertx.up.util.Ut;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static io.aeon.refine.Ho.LOG;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class HAeon implements Serializable {
    // 代码仓库
    private final ConcurrentMap<AeonRuntime, HRepo> repos = new ConcurrentHashMap<>();
    // 三种模式核心支持
    private final AeonMode mode;
    // 工作目录
    private final String workspace;
    private final String name;

    private final HPlot plot;

    // 启动配置
    private HBoot boot;

    /* 三种库 */
    private HAeon(final JsonObject configuration) {
        this.mode = Ut.toEnum(() -> Ut.valueString(configuration, KName.MODE),
            AeonMode.class, AeonMode.MIN);
        // 上层工作区
        this.name = Ut.valueString(configuration, HName.NAME);
        this.workspace = Ut.valueString(configuration, HName.WORKSPACE, HPath.WORKSPACE);
        // 云工作区 Plot
        JsonObject plotJ = Ut.valueJObject(configuration, KName.PLOT);
        plotJ = MatureOn.envPlot(plotJ);
        this.plot = Ut.deserialize(plotJ, HPlot.class);


        // 遍历读取 Repo, kinect, kidd, kzero
        this.initRepo(configuration);
    }

    public static HAeon configure(final JsonObject configJ) {
        // kidd 为出厂设置环境，所以以它为缓存键值
        final JsonObject repoJ = Ut.valueJObject(configJ, HName.REPO);
        final JsonObject kiddJ = Ut.valueJObject(repoJ, HName.KIDD);
        if (Ut.isNil(kiddJ)) {
            LOG.Aeon.warn(HAeon.class, "`kidd` configuration missing!!");
            return null;
        }
        // 初始化
        return CRunning.CC_AEON.pick(() -> new HAeon(configJ), kiddJ.hashCode());
    }

    private void initRepo(final JsonObject configuration) {
        final JsonObject repoJ = Ut.valueJObject(configuration, HName.REPO);
        Ut.<JsonObject>itJObject(repoJ, (itemJ, field) -> {
            final AeonRuntime repoType = Ut.toEnum(() -> field, AeonRuntime.class, null);
            if (Objects.nonNull(repoType)) {
                final HRepo repo = Ut.deserialize(itemJ, HRepo.class);
                // 绑定仓库工作区：workspace + runtime
                final String wsRepo = Ut.ioPath(this.workspace, repoType.name());
                this.repos.put(repoType, repo.assemble(wsRepo));
            }
        });
    }

    // ------------------------- 提取配置专用
    public HBoot inBoot() {
        return this.boot;
    }

    public HPlot inPlot() {
        return this.plot;
    }

    public AeonMode inMode() {
        return this.mode;
    }

    public String inWS() {
        return this.workspace;
    }

    public String inName() {
        return this.name;
    }

    public HRepo inRepo(final AeonRuntime runtime) {
        return this.repos.getOrDefault(runtime, null);
    }

    public ConcurrentMap<AeonRuntime, HRepo> inRepo() {
        return this.repos;
    }

    // ------------------------- 软连接方法
    // 装配专用
    public void assemble(final HBoot boot) {
        this.boot = boot;
    }
}
