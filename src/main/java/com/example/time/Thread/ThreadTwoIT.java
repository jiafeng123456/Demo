package com.example.time.Thread;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/28 0028 20:07
 */
public class ThreadTwoIT extends Thread{
    private String threadName;

    public ThreadTwoIT(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){
        System.out.println("threadName = " + threadName);
        Thread.interrupted();
    }
}
