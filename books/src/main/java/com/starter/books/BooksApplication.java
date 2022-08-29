package com.starter.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(
        basePackages = "com.starter.librarian.octopus"
)
public class BooksApplication  {
    public static void main(String[] args){
        SpringApplication.run(BooksApplication.class, args);
    }
}
