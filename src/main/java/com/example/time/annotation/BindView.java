package com.example.time.annotation;

import java.lang.annotation.*;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/27 0027 10:14
 */
@Documented
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface BindView {

}
