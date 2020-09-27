package com.example.time.services;

import java.lang.annotation.*;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/23 0023 10:40
 */
@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface SqlIgnore {
    public String value();
}
