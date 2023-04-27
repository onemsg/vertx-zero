package io.horizon.exception.internal;

import io.horizon.eon.error.ErrorCode;
import io.horizon.exception.InternalException;

public class PoolKeyNullException extends InternalException {
    public PoolKeyNullException(final Class<?> caller) {
        super(caller, ErrorCode._11008.M());
    }

    @Override
    protected int getCode() {
        return ErrorCode._11008.V();
    }
}
