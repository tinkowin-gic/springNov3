package com.my.test.No2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.test.No2.model.MyService;

@RestController
public class TestController {

    @Autowired
    private MyService myService;

    @GetMapping("/hello")
    public String hello() {
        return myService.getMessage();
    }
}
