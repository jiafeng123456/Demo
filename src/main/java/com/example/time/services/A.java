package com.example.time.services;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.Map;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/23 0023 10:51
 */
public class A {
    public static void main(String[] args) {
        Field[] fields =User.class.getDeclaredFields();
        for(int i = 0 ; i < fields.length ; i++){
            boolean a = SqlIgnore.class.equals(fields[i].getAnnotatedType());
            if (SqlIgnore.class.equals(fields[i].getAnnotations())){
                System.out.println(i);
            }
        }
    }

}
