package com.myapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author jiangqw
 * @date 2020/3/20 15:55
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "spittle not found")
public class SpittleNotFoundException extends RuntimeException {

    public SpittleNotFoundException() {
    }

    public SpittleNotFoundException(String message) {
        super(message);
    }

    public SpittleNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SpittleNotFoundException(Throwable cause) {
        super(cause);
    }

    public SpittleNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
