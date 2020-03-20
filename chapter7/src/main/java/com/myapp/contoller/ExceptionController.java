package com.myapp.contoller;

import com.myapp.exception.DuplicateSpittleException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author jiangqw
 * @date 2020/3/20 17:06
 */
@ControllerAdvice
public class ExceptionController {

    /**
     * 发生DuplicateSpittleException时抛出此异常
     *
     * @return view
     */
    @ExceptionHandler({DuplicateSpittleException.class})
    public String handleDuplicateSpittle() {
        return "error/duplicate";
    }
}
