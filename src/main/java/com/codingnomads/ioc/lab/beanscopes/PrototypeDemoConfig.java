package com.codingnomads.ioc.lab.beanscopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeDemoConfig {
    @Bean
    @Scope(value = "prototype")
    public SpringBean springBean() {
        return new SpringBean();
    }
    @Bean
    @Scope(value = "prototype")
    public ProtoBean2 protoBean2() {
            return new ProtoBean2();
        }
}
