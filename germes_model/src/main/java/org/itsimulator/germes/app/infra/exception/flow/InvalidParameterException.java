package org.itsimulator.germes.app.infra.exception.flow;

import org.itsimulator.germes.app.infra.exception.base.AppException;

public class InvalidParameterException extends AppException {
    private static final long serialVersionUID = 4990959228756992926L;

    /**
     * Signals that incorrect parameter was passed to method/constructor
     */
    public InvalidParameterException(String message) {
        super(message);
    }
}
