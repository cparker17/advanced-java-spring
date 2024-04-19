package com.codingnomads.corespring.lab;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Keyboard {
    private String keys;

    public Keyboard keyboard(){
        return new Keyboard();
    }

    public String getKeys(){
        return keys;
    }
}
