package com.my.test.No13.component;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@ConditionalOnProperty(name = "app.runConditional", havingValue = "true")
public class ConditionalPropertyInitializer {

    @PostConstruct
    public void init() {
        System.out.println("=== [B] @ConditionalOnProperty initializer running ===");
    }
}