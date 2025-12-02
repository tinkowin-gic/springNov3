package com.my.test.No15.services;

import org.springframework.stereotype.Service;

@Service("no15Service")
public class MyService {

    public void performTask() {
        try {
            Thread.sleep(3000); // simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task performed!");
    }
}
