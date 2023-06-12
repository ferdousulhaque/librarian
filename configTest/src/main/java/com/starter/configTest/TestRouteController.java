package com.starter.configTest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@Configuration
@RefreshScope
public class TestRouteController {

    @Value("${message}")
    private String text;

    @GetMapping("/testing")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok(text);
    }
}
