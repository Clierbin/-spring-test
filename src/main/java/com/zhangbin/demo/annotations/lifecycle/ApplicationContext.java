package com.zhangbin.demo.annotations.lifecycle;

import com.zhangbin.project.entity.Airplane;
import com.zhangbin.project.entity.Cat;
import com.zhangbin.project.entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat=(Cat) app.getBean("cat");
        cat.run();
        app.close();
    }
    @Test
    public void test(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Airplane airplane = (Airplane) app.getBean("airplane");
        airplane.flay();
        app.close();
    }
}
