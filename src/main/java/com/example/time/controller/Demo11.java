package com.example.time.controller;

import java.util.Stack;

/*
 *@author jiafeng
 *@date 2019/9/19 0019 15:28
 */
public class Demo11 {
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2.intern());
        System.out.println(s1 == s2);
    }
}
