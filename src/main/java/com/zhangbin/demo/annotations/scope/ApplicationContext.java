package com.zhangbin.demo.annotations.scope;

import com.zhangbin.project.entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person1 = (Person)annotationConfigApplicationContext.getBean("person");
        Person person2 = (Person)annotationConfigApplicationContext.getBean("person");
        System.out.println(person1 == person2);
    }

}
