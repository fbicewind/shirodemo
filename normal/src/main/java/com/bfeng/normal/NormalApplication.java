package com.bfeng.normal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bfeng.normal", "com.bfeng.shiro.config", "com.bfeng.shiro.controller", "com.bfeng.base"})
public class NormalApplication {

    public static void main(String[] args) {
        SpringApplication.run(NormalApplication.class, args);
    }
}
