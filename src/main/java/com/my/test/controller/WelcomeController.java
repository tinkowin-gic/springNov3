package com.my.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.test.component.CustomHealthIndicator;
import com.my.test.component.MyPostConstruct;
import com.my.test.component.MyScheduledTask;
import com.my.test.component.MyService1;
import com.my.test.services.MyService;


@RestController
public class WelcomeController{

    @Autowired
    private MyService1 service1; // component class

    @Autowired
    private MyService service; // service class

    @Autowired
    private CustomHealthIndicator customHealthIndicator;

    @Autowired
    private MyScheduledTask myScheduledTask;

    @Autowired
    private MyPostConstruct myPostConstruct;
    
    @GetMapping("/")
    public String welocme(){
        String str1 = service1.component1();
        String str2 = service.execute();
        return str1 + " " + str2;
    }

    @GetMapping("/test")
    public String errorTest(){
        customHealthIndicator.health();
        myScheduledTask.runTask();
        myPostConstruct.init();
        throw new RuntimeException("Exception Test");
    }
}
