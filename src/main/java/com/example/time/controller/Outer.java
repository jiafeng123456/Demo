package com.example.time.controller;

/*
 *@description:
 *@author jiafeng
 *@date 2019/9/23 0023 09:50
 */
public class Outer {
    class Inner {}

    public static void foo() { new Outer().new Inner(); }

    public void bar() { new Inner(); }

    public static void main(String[] args) {
        new Outer().new Inner();
    }
}
