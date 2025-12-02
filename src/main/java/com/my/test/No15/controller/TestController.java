package com.my.test.No15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.test.No15.services.MyService;

@RestController("no15TestController")
public class TestController {
    
    @Autowired
    private MyService myService;

    @GetMapping("/no15Test")
    public String test(){
       myService.performTask();
       return "No15....";
    }
}
