package com.zhangbin.demo.annotations.Import;

import com.zhangbin.project.entity.Cat;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean meber = registry.containsBeanDefinition("member");
        boolean company = registry.containsBeanDefinition("company");
        if (meber && company) {
            BeanDefinition beanDefinition = new RootBeanDefinition(Cat.class);
            registry.registerBeanDefinition("cat", beanDefinition);
        }
    }
}
