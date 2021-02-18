package com.example.time.Thread.ThreadOne;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/30 0030 17:03
 */
public class ThreadOneModel {
    private static Lock lock = new ReentrantLock();
    private static Integer MAX_MESSAGE = 20;
    private Integer allMessage = 0;

    public Integer getAllMessage() {
        return allMessage;
    }

    public void addMessage() throws InterruptedException {
        synchronized (lock){
            while (allMessage >= MAX_MESSAGE){
                System.out.println("消息大于100，无法继续生成！等待中....");
                lock.wait();
            }
            lock.notify();
            allMessage++;
            System.out.println("生产 1条数据，当前剩余多少消息 allMessage = " + allMessage);
            Thread.sleep(10);
        }
    }

    public void delMessage() throws InterruptedException {
        synchronized (lock){
            while (allMessage <= 0){
                System.out.println("消息不足1，无法继续消费，等待中.....");
                lock.wait();
            }
            lock.notify();
            allMessage--;
            System.out.println("消费1条数据，当前剩余多少消息 allMessage = " + allMessage);
            Thread.sleep(10);
        }
    }
}
