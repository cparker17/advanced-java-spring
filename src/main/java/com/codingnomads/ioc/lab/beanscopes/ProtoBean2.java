package com.codingnomads.ioc.lab.beanscopes;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class ProtoBean2 {
    public ProtoBean2() {
        System.out.println("I'm a bean too...");
    }

}
