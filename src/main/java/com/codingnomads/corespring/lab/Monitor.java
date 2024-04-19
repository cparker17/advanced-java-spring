package com.codingnomads.corespring.lab;

import org.springframework.stereotype.Component;

@Component
public class Monitor {
    private String screen;

    public Monitor monitor() {
        return new Monitor();
    }

    public String getScreen() {
        return screen;
    }
}
