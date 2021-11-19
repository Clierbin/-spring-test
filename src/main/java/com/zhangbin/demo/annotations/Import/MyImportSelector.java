package com.zhangbin.demo.annotations.Import;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.zhangbin.project.entity.Cat",
        "com.zhangbin.project.entity.Dog"};
    }
}
