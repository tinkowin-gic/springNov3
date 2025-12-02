package com.my.test.No8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.test.No8.component.CustomHealthIndicator;

@RestController("no8Contoller")
public class TestController {

    @Autowired
    private CustomHealthIndicator customHealthIndicator;

    @GetMapping("/no8Test")
    public String test() {
        return customHealthIndicator.health().toString();
    }
}
