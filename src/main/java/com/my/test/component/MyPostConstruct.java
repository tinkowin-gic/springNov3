package com.my.test.component;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MyPostConstruct {
    
    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: runs after bean creation");
    }
}
