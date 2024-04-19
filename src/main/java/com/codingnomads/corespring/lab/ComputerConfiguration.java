package com.codingnomads.corespring.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ComputerConfiguration {
    @Bean
    public Keyboard keyboard(){
        return new Keyboard();
    }

    @Bean
    public Monitor monitor(){
        return new Monitor();
    }
}
