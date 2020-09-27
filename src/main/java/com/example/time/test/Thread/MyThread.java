package com.example.time.test.Thread;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/16 0016 09:56
 */
public class MyThread implements Runnable {

    private int count = 5;
    @Override
    public void run() {
        count--;
        System.out.println("线程"+Thread.currentThread().getName()+ " 计算 count = " + count);
    }
}
