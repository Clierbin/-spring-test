package com.zhangbin.demo.annotations.compoentscan;

import com.zhangbin.demo.annotations.compoentscan.aspectj.MyAspectjFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "com.zhangbin.project",
//                includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class})})
                includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM,value = {MyAspectjFilter.class})},
                useDefaultFilters = false)
public class MyConfig {

}
