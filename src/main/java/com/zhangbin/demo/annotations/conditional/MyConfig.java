package com.zhangbin.demo.annotations.conditional;


import com.zhangbin.project.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Conditional(WindowsCondition.class)
    @Bean
    public Person person1(){
        System.out.println("Person对象张斌被创建");
        return new Person("zhangbin",19);
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public Person person2(){
        System.out.println("Person对象王五被创建");
        return new Person("wangwu",19);
    }
}
