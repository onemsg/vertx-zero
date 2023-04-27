package io.horizon.exception.internal;

import io.horizon.eon.error.ErrorCode;
import io.horizon.exception.InternalException;
import io.horizon.util.HaS;

public class EmptyIoException extends InternalException {

    public EmptyIoException(final Class<?> caller, final String filename) {
        super(caller, HaS.fromMessage(ErrorCode._11002.M(), filename));
    }

    @Override
    protected int getCode() {
        return ErrorCode._11002.V();
    }
}
