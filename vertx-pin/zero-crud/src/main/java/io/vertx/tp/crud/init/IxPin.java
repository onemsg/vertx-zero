package io.vertx.tp.crud.init;

import io.aeon.experiment.mixture.HOne;
import io.aeon.experiment.specification.KModule;
import io.vertx.tp.crud.uca.desk.IxMod;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.up.atom.Rule;
import io.vertx.up.commune.Envelop;
import io.vertx.up.uca.jooq.UxJoin;
import io.vertx.up.uca.jooq.UxJooq;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import static io.vertx.tp.crud.refine.Ix.LOG;

/*
 * Init Plugin for `init` static life
 */
public class IxPin {

    public static void init() {
        Ke.banner("「Εκδήλωση」- Crud ( Ix )");

        LOG.Init.info(IxPin.class, "IxConfiguration...");
        /* Configuration Init */
        IxConfiguration.init();

        LOG.Init.info(IxPin.class, "IxDao...");
        /* Dao Init */
        IxDao.init();

        LOG.Init.info(IxPin.class, "IxValidator...");
        /* Validator Init */
        IxValidator.init();
    }

    public static KModule getActor(final String actor) {
        return IxDao.get(actor);
    }

    public static UxJooq jooq(final IxMod in) {
        final Envelop envelop = in.envelop();
        return jooq(in.module(), envelop);
    }

    public static UxJooq jooq(final KModule module, final Envelop envelop) {
        final HOne<UxJooq> jq = HOne.jooq();
        return jq.combine(module, envelop.headers());
    }

    public static UxJoin join(final IxMod in, final KModule connect) {
        final HOne<UxJoin> jq = HOne.join();
        return jq.combine(in.module(), connect);
    }

    public static Set<String> getUris() {
        return IxConfiguration.getUris();
    }

    public static ConcurrentMap<String, List<Rule>> getRules(final String actor) {
        return IxValidator.getRules(actor);
    }

    public static String getColumnKey() {
        return IxConfiguration.getField();
    }

    public static String getColumnLabel() {
        return IxConfiguration.getLabel();
    }
}
