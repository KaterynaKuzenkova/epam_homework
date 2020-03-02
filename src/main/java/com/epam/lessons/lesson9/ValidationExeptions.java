package com.epam.lessons.lesson9;

public class ValidationExeptions extends Exception {
    public ValidationExeptions() {
        super();
    }

    public ValidationExeptions(String message) {
        super(message);
    }

    public ValidationExeptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidationExeptions(Throwable cause) {
        super(cause);
    }

    protected ValidationExeptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
