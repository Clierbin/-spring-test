package com.zhangbin.project.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean, DisposableBean {

    public void init(){
        System.out.println("汽车正在启动!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("汽车正在启动!");
    }

    public void run(){
        System.out.println("汽车正在飙车!");
    }
    @Override
    public void destroy(){
        System.out.println("汽车被销毁了!");
    }
}
