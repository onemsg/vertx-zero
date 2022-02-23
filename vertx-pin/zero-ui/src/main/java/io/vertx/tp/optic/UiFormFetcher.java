package io.vertx.tp.optic;

import cn.vertxup.ui.service.FieldService;
import cn.vertxup.ui.service.FormService;
import cn.vertxup.ui.service.FormStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.optic.ui.Form;
import io.vertx.tp.ui.refine.Ui;
import io.vertx.up.eon.KName;
import io.vertx.up.log.Annal;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class UiFormFetcher implements Form {
    private final static Annal LOGGER = Annal.get(UiFormFetcher.class);

    @Override
    public Future<JsonObject> fetchUi(final JsonObject params) {
        final Boolean dynamic = params.getBoolean(KName.DYNAMIC, Boolean.FALSE);
        final String code = params.getString(KName.CODE);
        Ui.infoUi(LOGGER, "( Form ) parameters: {0}", params.encode());
        if (dynamic) {
            final FormStub formStub = Ut.singleton(FormService.class);
            Ut.field(formStub, "fieldStub", Ut.singleton(FieldService.class));
            final String sigma = params.getString(KName.SIGMA);
            return formStub.fetchByCode(code, sigma);
        } else {
            final JsonObject formData = Ut.ioJObject(code);
            return Ux.future(formData);
        }
    }
}
