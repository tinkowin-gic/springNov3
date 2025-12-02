package com.my.test.No14.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("no14Controller")
public class TestController {
    
    @Autowired
    @Qualifier("db1")
    private DataSource ds1;

    @Autowired
    @Qualifier("db2")
    private DataSource ds2;

    @GetMapping("/no14Test")
    public String test(){
        System.out.println(ds2.getClass().getName());
        return ds1.getClass().getName();
    }
}
