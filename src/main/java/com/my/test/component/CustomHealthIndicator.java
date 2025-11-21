package com.my.test.component;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {
    
     @Override
    public Health health() {
        int errorCode = check(); // perform your custom health check
        if (errorCode != 0) {
            return Health.down()
                    .withDetail("Error Code", errorCode)
                    .build();
        }
        return Health.up().build();
    }

    private int check() {
        System.out.println("Successful....");
        return 0;
    }
}
