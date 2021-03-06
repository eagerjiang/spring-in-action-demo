package com.myapp.config;

import com.myapp.MyServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author jiangqw
 * @date 2020/2/6 15:08
 */
public class MyServletInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet", MyServlet.class);
        myServlet.addMapping("/custom/**");
        myServlet.setMultipartConfig(new MultipartConfigElement("/tmp/spittr/uploads"));
    }
}