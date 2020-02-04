package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author jiangqw
 * @date 2020/1/22 16:28
 */
@Configuration
@ComponentScan(basePackages = {"spittr"},excludeFilters = {@ComponentScan.Filter(value = EnableWebMvc.class)})
public class RootConfig {
}
