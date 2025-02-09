package io.vertx.tp.error;

import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;

public class _500InitSpecificationException extends WebException {

    public _500InitSpecificationException(final Class<?> clazz,
                                          final String name) {
        super(clazz, name);
    }

    @Override
    public int getCode() {
        return -80302;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.INTERNAL_SERVER_ERROR;
    }
}
