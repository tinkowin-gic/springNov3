package com.my.test.No10.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduledTask {

    @Scheduled(fixedDelay = 3000) // runs every 5 seconds
    public void runTask() {
        System.out.println("Scheduled: runs repeatedly every 3 seconds");
    }
}
