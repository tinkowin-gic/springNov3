package com.my.test.No2.services;

import org.springframework.stereotype.Service;

import com.my.test.No2.model.MyService;

@Service
public class MyServiceImpl implements MyService{

    public String getMessage() {
        return "Hello, World!";
    }
}
