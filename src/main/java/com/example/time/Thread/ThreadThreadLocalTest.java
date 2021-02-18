package com.example.time.Thread;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/30 0030 15:40
 */
public class ThreadThreadLocalTest {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    private static Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        threadLocal.set("我是主线程的threadLocal");
        Thread threadOne = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public synchronized void run() {
                this.wait();
                threadLocal.set("我是threadOne的threadLocal");
                System.out.println(threadLocal.get());
            }
        });
        System.out.println(threadLocal.get());
        threadOne.notify();
        threadOne.start();
//        threadOne.join();
    }
}
