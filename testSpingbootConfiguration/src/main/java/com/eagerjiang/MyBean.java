package com.eagerjiang;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author jiangqw
 * @date 2020/1/7 18:00
 */
@Service
@Data
public class MyBean {
    @Value("#{environment['name']}")
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
