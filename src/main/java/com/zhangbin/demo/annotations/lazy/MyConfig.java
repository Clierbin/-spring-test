package com.zhangbin.demo.annotations.lazy;

import com.zhangbin.project.entity.Person;
import org.springframework.context.annotation.*;

@Configuration
public class MyConfig {
    @Lazy
    @Bean
    public Person person(){
        System.out.println("person被创建");
        return new Person("zhangbin",14);
    }
}
