package io.modello.specification.atom;

import io.modello.atom.app.KApp;
import io.modello.atom.normalize.KMarkAtom;
import io.modello.eon.em.ModelType;
import io.modello.specification.HApp;

import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface HModel extends HApp {
    /*
     * Rule that is stored into model table or model object
     * it's related to build RuleUnique object/reference instead of
     */
    HUnique rule();

    /*
     * The type of model here
     * - DIRECT
     * - VIEW
     * - JOINED
     *
     * There are situations as following:
     * 1) Direct: mapped to database metadata stored. ( Zero Extension Model )
     * 2) View: mapped to database metadata view stored. ( Zero Extension Model )
     * 3) Joined: mapped to joined metadata ( Code Logical Extension or Other )
     */
    ModelType type();

    /*
     * The attribute names hash set here
     *
     * Attribute name building
     */
    Set<String> attribute();

    /*
     * The attribute extracting method by `name`
     */
    HAttribute attribute(String name);


    KApp app();

    KMarkAtom tag();

    HReference reference();
}
