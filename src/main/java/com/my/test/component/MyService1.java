package com.my.test.component;

import org.springframework.stereotype.Component;

@Component
public class MyService1 {

    public String component1() {
        System.out.println("Component class is running.");
        return "MyService1 Class Component";
    }
}
