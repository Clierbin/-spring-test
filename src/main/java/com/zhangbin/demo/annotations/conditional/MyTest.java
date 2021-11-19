package com.zhangbin.demo.annotations.conditional;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MyTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames)
                .replaceAll("\\[|\\]","")
                .replaceAll(",","\n")
        );
    }
}
