package com.my.test.No13.component;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppListenerInitializer implements ApplicationListener<ApplicationReadyEvent> {

    private final Environment env;

    public AppListenerInitializer(Environment env) {
        this.env = env;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        String[] activeProfiles = env.getActiveProfiles();
        for (String profile : activeProfiles) {
            if ("dev".equals(profile)) {
                System.out.println("=== [C] ApplicationListener running (dev profile) ===");
            }
        }
    }
}
