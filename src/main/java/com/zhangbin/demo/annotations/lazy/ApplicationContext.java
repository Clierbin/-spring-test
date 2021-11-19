package com.zhangbin.demo.annotations.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ApplicationContext {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("ApplicationContext 启动");
        Object person = app.getBean("person");
    }

}
