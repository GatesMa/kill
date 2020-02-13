package com.gatesma.kill.server;

import com.gatesma.kill.api.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * Copyright (C), 2020
 * FileName: MainApplication
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/2/12 23:05
 * Description:
 */
@SpringBootApplication
@ImportResource(value = {"classpath:spring/spring-jdbc.xml"})
@MapperScan(basePackages = "com.gatesma.kill.model.mapper")
public class MainApplication{

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
