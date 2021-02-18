package com.example.time.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/28 0028 21:16
 */
public class ThreadInterruptTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new ThreadPoolDemo("thread1"));
        executorService.execute(new ThreadPoolDemo("thread2"));
        executorService.execute(new ThreadPoolDemo("thread3"));
        executorService.execute(new ThreadPoolDemo("thread4"));
    }
}

class ThreadPoolDemo extends Thread{
    private String threadName;
//    private Lock lock = new ReentrantLock();
    public ThreadPoolDemo(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){
//        lock.lock();
        System.out.println(threadName);
//        lock.unlock();
    }
}
