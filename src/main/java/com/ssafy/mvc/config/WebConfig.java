package com.ssafy.mvc.config;

import com.ssafy.mvc.interceptor.LoginValidationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    LoginValidationInterceptor loginValidationInterceptor;

    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(loginValidationInterceptor).addPathPatterns("/login");
    }

}
