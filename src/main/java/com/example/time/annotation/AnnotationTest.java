package com.example.time.annotation;

import java.util.TreeMap;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/27 0027 10:16
 */
public class AnnotationTest {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("3","3");
        testMethod();
    }

    public static void testMethod(){
        @AnnotationDemo String a = null;
        System.out.println(a);
    }
}
