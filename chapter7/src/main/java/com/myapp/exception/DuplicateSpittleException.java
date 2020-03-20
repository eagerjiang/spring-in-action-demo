package com.myapp.exception;

/**
 * @author jiangqw
 * @date 2020/3/20 17:05
 */
public class DuplicateSpittleException extends RuntimeException {
    public DuplicateSpittleException() {
    }

    public DuplicateSpittleException(String message) {
        super(message);
    }

    public DuplicateSpittleException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateSpittleException(Throwable cause) {
        super(cause);
    }

    public DuplicateSpittleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
