package io.vertx.tp.ambient.init;

import io.horizon.spi.extension.Init;
import io.horizon.spi.extension.Prerequisite;
import io.horizon.uca.log.Annal;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.tp.ambient.atom.AtConfig;
import io.vertx.tp.error._500InitSpecificationException;
import io.vertx.tp.error._500PrerequisiteSpecException;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;

import static io.vertx.tp.ambient.refine.At.LOG;

/**
 * ## 「Init」AtPin
 *
 * ### 1. Intro
 *
 * This component could be configured in `vertx-extension.yml` file such as following segment:
 *
 * ```yaml
 * // <pre><code class="yaml">
 *
 * init:
 *     - component: io.vertx.tp.ambient.init.AtPin
 *
 * // </code></pre>
 * ```
 *
 * When zero container starting up, the `AtPin.init()` method will be called by framework.
 *
 * #### 1.1. init()
 *
 * This method will be call in zero framework booting workflow and it will do following phases:
 *
 * - Call `AtConfiguration.init()` to initialize the configuration data of current module.
 * - Call `AtTodo.init()` to initialize the `todo` environment of current module, related to `X_TODO`.
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class AtPin {
    /**
     * Zero standard logger of {@link Annal} instance.
     */
    private static final Annal LOGGER = Annal.get(AtPin.class);

    /**
     * 「Booting」This method must be defined and it will be called when zero container booting up.
     */
    public static Future<Boolean> init(final Vertx vertx) {
        Ke.banner("「περιβάλλων」- Ambient ( At )");
        LOG.Init.info(LOGGER, "AtConfiguration...");
        AtConfiguration.init();
        return Ux.futureT();
    }

    /**
     * Return to reference of {@link io.vertx.tp.ambient.atom.AtConfig} instance.
     *
     * @return {@link io.vertx.tp.ambient.atom.AtConfig} Deserialized application configuration data.
     */
    public static AtConfig getConfig() {
        return AtConfiguration.getConfig();
    }


    /**
     * Configuration initialization phase.
     *
     * @return {@link Init}
     */
    public static Init getInit() {
        return getInit(getConfig().getInitializer());
    }

    /**
     * Data initialization phase.
     *
     * @return {@link Init}
     */
    public static Init getLoader() {
        return getInit(getConfig().getLoader());
    }

    /**
     * The uniform method that could be called private.
     *
     * @param initClass {@link java.lang.Class} Input class type that will be reflect to `Init`
     *
     * @return {@link Init}
     * @throws io.vertx.tp.error._500InitSpecificationException Failure then configuration missing.
     */
    private static Init getInit(final Class<?> initClass) {
        if (Objects.isNull(initClass)) {
            return null;
        } else {
            Fn.outWeb(!Ut.isImplement(initClass, Init.class), _500InitSpecificationException.class,
                AtPin.class, initClass.getName());
            return Init.generate(initClass);
        }
    }

    /**
     * Return to `Pre-` component that defined in zero extension modules.
     *
     * @return {@link Prerequisite}
     * @throws io.vertx.tp.error._500PrerequisiteSpecException Failure then configuration missing.
     */
    public static Prerequisite getPrerequisite() {
        final Class<?> prerequisite = getConfig().getPrerequisite();
        if (Objects.isNull(prerequisite)) {
            return null;
        } else {
            Fn.outWeb(!Ut.isImplement(prerequisite, Prerequisite.class), _500PrerequisiteSpecException.class,
                AtPin.class, prerequisite.getName());
            return Prerequisite.generate(prerequisite);
        }
    }
}
