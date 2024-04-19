package com.codingnomads.ioc.lab.beanscopes;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ProtoTypeDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(PrototypeDemoConfig.class);
        ctx.refresh();

        SpringBean springBean1 = ctx.getBean(SpringBean.class);
        System.out.println("Hash code: " + springBean1.hashCode());

        SpringBean springBean2 = ctx.getBean(SpringBean.class);
        System.out.println("Hash code: " + springBean2.hashCode());

        ProtoBean2 protoBean2 = ctx.getBean(ProtoBean2.class);
        System.out.println("Hash code = " + protoBean2.hashCode());

        ProtoBean2 protoBean21 = ctx.getBean(ProtoBean2.class);
        System.out.println("Has code = " + protoBean21.hashCode());

        ctx.close();
    }
}
