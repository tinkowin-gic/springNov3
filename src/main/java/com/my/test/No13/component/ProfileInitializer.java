package com.my.test.No13.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Profile("dev") // runs only when 'dev' profile is active
public class ProfileInitializer {

    @PostConstruct
    public void init() {
        System.out.println("=== [A] @Profile initializer running (dev profile) ===");
    }
}
