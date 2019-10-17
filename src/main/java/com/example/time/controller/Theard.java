package com.example.time.controller;

/*
 *@author jiafeng
 *@date 2019/9/3 0003 11:22
 */
public class Theard {
    public static void main(String[] args) {
        TheardTest t = new TheardTest("新的线程");
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main线程！"+i);
        }
    }
}
