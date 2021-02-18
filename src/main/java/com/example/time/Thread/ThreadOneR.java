package com.example.time.Thread;

import java.util.concurrent.CountDownLatch;

/*
 *@description: 实现 Runnable接口实现 线程
 *@author jiafeng
 *@date 2020/12/28 0028 14:19
 */
public class ThreadOneR extends Thread{

    private ThreadOneRModel threadOneRModel;

    private CountDownLatch countDownLatch;

    private double money;

    public ThreadOneR(ThreadOneRModel threadOneRModel, CountDownLatch countDownLatch, double money){
        this.threadOneRModel = threadOneRModel;
        this.countDownLatch = countDownLatch;
        this.money = money;
    }

    @Override
    public void run() {
        threadOneRModel.deposit(money);
        this.countDownLatch.countDown();
    }
}
