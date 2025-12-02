package com.my.test.No10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.test.No10.component.MyPostConstruct;

@RestController("no10Controller")
public class TestController {

    @Autowired
    private MyPostConstruct myPostConstruct;

    @GetMapping("/no10Test")
    public String test() throws Exception {
        myPostConstruct.init();
        return "Test ProConstruct.";
    }
}
