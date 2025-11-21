package com.my.test.controller;

import org.springframework.boot.webmvc.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
public class MyErrorController implements ErrorController{

    @GetMapping("/error")
    public String global() {
        return "Custom error page";
    }
}
