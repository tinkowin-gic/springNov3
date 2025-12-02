package com.my.test.No10.component;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MyPostConstruct {

    @PostConstruct
    public void init() {
        System.out.println("===> From PostConstruct <===");
    }
}
