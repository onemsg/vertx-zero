package io.vertx.tp.error;

import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class _501EventStartMissingException extends WebException {

    public _501EventStartMissingException(final Class<?> clazz, final String definitionId) {
        super(clazz, definitionId);
    }

    @Override
    public int getCode() {
        return -80601;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.NOT_IMPLEMENTED;
    }
}