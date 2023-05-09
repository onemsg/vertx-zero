package io.horizon.specification.modeler;

import io.modello.atom.normalize.KReference;
import io.modello.atom.normalize.RQuery;
import io.modello.atom.normalize.RQuote;
import io.modello.atom.normalize.RResult;

import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface HReference {

    KReference refData(String name);

    ConcurrentMap<String, RQuote> refInput();

    ConcurrentMap<String, RQuery> refQr();

    ConcurrentMap<String, RResult> refOutput();
}
