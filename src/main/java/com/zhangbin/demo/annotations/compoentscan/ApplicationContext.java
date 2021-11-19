package com.zhangbin.demo.annotations.compoentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ApplicationContext {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames)
                .replaceAll("\\{|\\]","")
                // 改为换行
                .replaceAll(",","\n")
                );
    }

}
