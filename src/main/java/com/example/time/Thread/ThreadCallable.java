package com.example.time.Thread;

import java.util.concurrent.Callable;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/30 0030 14:29
 */
public class ThreadCallable implements Callable {

    @Override
    public String call() throws InterruptedException {
        System.out.println("线程开始-------------time = " + System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println("线程结束-------------time = " + System.currentTimeMillis());
        return "我结束了";
    }
}
