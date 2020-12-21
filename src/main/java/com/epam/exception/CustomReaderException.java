package com.epam.exception;

public class CustomReaderException extends Exception {
    public CustomReaderException() {
        super();
    }

    public CustomReaderException(String message) {
        super(message);
    }

    public CustomReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomReaderException(Throwable cause) {
        super(cause);
    }

    protected CustomReaderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
