package com.my.test.No4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.test.No4.services.DataBaseTest;

@RestController("no4Controller")
public class TestController {
    
    @Autowired
    private DataBaseTest dadBaseTest;

    @GetMapping("/no4DbTest")
    public String Test(){
        return dadBaseTest.test();
    }
}
