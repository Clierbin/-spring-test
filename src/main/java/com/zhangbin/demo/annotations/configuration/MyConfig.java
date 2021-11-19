package com.zhangbin.demo.annotations.configuration;

import com.zhangbin.project.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {


    @Bean
    public Person person(){
        return new Person("zhangbin",14);
    }
}
