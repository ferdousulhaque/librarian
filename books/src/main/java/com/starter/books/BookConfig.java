package com.starter.books;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@RefreshScope
public class BookConfig {
    @Value("${server.port}")
    private int serverPort;
}
