package com.my.test.services;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String execute() {
        System.out.println("Service Class is running.");
        return "MyService Class Service";
    }
}
