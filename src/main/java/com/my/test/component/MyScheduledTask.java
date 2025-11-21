package com.my.test.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduledTask {

    @Scheduled(fixedDelay = 5000) // runs every 5 seconds
    public void runTask() {
        System.out.println("Scheduled: runs repeatedly every 5 seconds");
    }
}
