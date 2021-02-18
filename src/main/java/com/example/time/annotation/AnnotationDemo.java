package com.example.time.annotation;

import java.lang.annotation.*;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/30 0030 10:07
 */
//@Target({ElementType.METHOD,ElementType.FIELD,ElementType.PARAMETER})
@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnotationDemo {
    boolean value() default false;
}
