package com.example.time.controller;

import java.util.concurrent.locks.Lock;

/*
 *@author jiafeng
 *@date 2019/8/19 0019 15:26
 */
public class TheardTest extends Thread {

    public TheardTest(String name) {
     super(name);
    }

    @Override
    public void run() {
        Lock:
        for (int i = 0;i<100;i++){
            System.out.println(getName()+"正在执行"+ i);
        }
    }
}
