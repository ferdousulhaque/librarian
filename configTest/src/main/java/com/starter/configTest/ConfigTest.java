package com.starter.configTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class ConfigTest {
    public static void main(String[] args) {
        SpringApplication.run(ConfigTest.class, args);
    }
}
