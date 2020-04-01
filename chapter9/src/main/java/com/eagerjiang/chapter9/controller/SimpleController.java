package com.eagerjiang.chapter9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangqw
 * @date 2020/3/25 17:25
 */
@RestController
public class SimpleController {
    @GetMapping("/")
    public String home() {
        return "hello world";
    }
}
