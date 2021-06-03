package com.bjsxt.web.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * SimpleMappingExceptionResolver处理异常机制
 * 只可以做到页面跳转，无法做到数据传输
 */
//@Configuration
public class GlobalExceptionHandle2 {

    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties properties = new Properties();
        properties.put("java.lang.NullPointerException","error");
        properties.put("java.lang.ArithmeticException","error2");
        resolver.setExceptionMappings(properties);
        return resolver;
    }
}
