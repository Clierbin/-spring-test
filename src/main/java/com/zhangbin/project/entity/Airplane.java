package com.zhangbin.project.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Airplane {
    @PostConstruct
    public void postConstruck(){
        System.out.println("飞机正在加油!");
    }

    public  void flay(){
        System.out.println("飞机正在飞行!");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("飞机已落地");
    }
}
