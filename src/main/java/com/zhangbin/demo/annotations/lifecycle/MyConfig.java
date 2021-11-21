package com.zhangbin.demo.annotations.lifecycle;

import com.zhangbin.project.entity.Airplane;
import com.zhangbin.project.entity.Cat;
import com.zhangbin.project.entity.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScans(
        {
                @ComponentScan("com.zhangbin.project.entity"),
                @ComponentScan("com.zhangbin.demo.annotations.lifecycle")

        }
)
public class MyConfig {
    // 对Bean生命周期的监控
    // 1,通过@Bean 方法中 initMethod,destroyMethod 来指定对应要执行的方法
    // 2,分变实现 InitializingBean,DisposableBean 接口
    // 3,使用@PostConstruct 和 @PreDestroy 注解
    // 4,自己写一个了类实现@BeanPostProcessor 对Bean Initialization 前后做处理
//    @Bean(initMethod = "init" , destroyMethod = "destroy")
    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Airplane airplane() {
        return new Airplane();
    }
}
