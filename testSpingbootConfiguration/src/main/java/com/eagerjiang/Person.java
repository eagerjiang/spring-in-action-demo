package com.eagerjiang;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * @author jiangqw
 * @date 2020/1/8 15:27
 */
@Service
@ConfigurationProperties(prefix = "person")
@Data
public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "name: " + name + "\n" + "age: " + age;
    }
}
