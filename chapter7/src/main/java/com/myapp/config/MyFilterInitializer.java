package com.myapp.config;

import com.myapp.MyFilter;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author jiangqw
 * @date 2020/2/9 20:34
 */
public class MyFilterInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        FilterRegistration.Dynamic filterRegistration = servletContext.addFilter("myFilter",
                MyFilter.class);
        filterRegistration.addMappingForUrlPatterns(null, false, "/custom/*");
    }
}
