package com.my.test.No5.controller;

import org.springframework.boot.webmvc.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController{

    @GetMapping("/error")
    public String error() {
        return "Custom error page";
    }
}
