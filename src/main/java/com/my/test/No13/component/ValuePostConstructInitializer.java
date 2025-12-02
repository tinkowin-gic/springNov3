package com.my.test.No13.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class ValuePostConstructInitializer {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @PostConstruct
    public void init() {
        if ("dev".equals(activeProfile)) {
            System.out.println("=== [D] @Value + @PostConstruct running (dev profile) ===");
        }
    }
}
