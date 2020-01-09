package com.eagerjiang.controller;

import com.eagerjiang.MyBean;
import com.eagerjiang.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangqw
 * @date 2020/1/8 9:59
 */
@RestController
public class HelloController {
    @Autowired
    private MyBean myBean;

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String sayHello() {
        return myBean.toString();
    }

    @RequestMapping("/person")
    private String showPerson() {
        return person.toString();
    }

    @RequestMapping("/testSpEL")
    private String getMyBean(@Value("#{\"uuid:\"+myBean.name}") String value) {
        return value;
    }
}
