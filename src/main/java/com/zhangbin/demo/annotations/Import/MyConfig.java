package com.zhangbin.demo.annotations.Import;


import com.zhangbin.project.entity.Cat;
import com.zhangbin.project.entity.Company;
import com.zhangbin.project.entity.Dog;
import com.zhangbin.project.entity.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;

@Configuration
//@Import({Cat.class, Dog.class})
//@Import(MyImportSelector.class)
@Import(MyImportBeanDefinitionRegistrar.class)
public class MyConfig {

    @Bean
    public Company company(){
        return new Company();
    }

    @Bean
    public Member member(){
        return new Member();
    }

}
