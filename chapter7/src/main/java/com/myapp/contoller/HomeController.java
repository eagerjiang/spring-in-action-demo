package com.myapp.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jiangqw
 * @date 2020/1/22 17:00
 */
@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home() {
        return "home";
    }
}
