package com.example.time.Thread;

/*
 *@description: 多线程常用方法
 *@author jiafeng
 *@date 2020/12/28 0028 21:02
 */
public class ThreadMethodTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo("thread");
        ThreadDemo threadDemo1 = new ThreadDemo("thread1");
        ThreadDemo threadDemo2 = new ThreadDemo("thread2");
        threadDemo.setPriority(1);
        threadDemo1.setPriority(2);
        threadDemo2.setPriority(3);
        threadDemo1.start();
        threadDemo.start();
        threadDemo2.start();

//        //运行当前线程
//        threadDemo.run();
//        System.out.println(threadDemo.isAlive());
//        //当前线程进入等待队列
//        threadDemo1.start();
//        threadDemo1.join();
//        threadDemo.start();
//        threadDemo.setDaemon(true);
//
//        System.out.println(threadDemo.isAlive());
//        System.out.println(threadDemo1.isAlive());
//        //判断当前线程是否是守护线程
//        System.out.println(threadDemo.isDaemon());
    }
}

class ThreadDemo extends Thread{
    private String name;
    public ThreadDemo(String name){
        this.name = name;
    }

    @Override
    public void run() {
//        for (int i = 0 ; i < 100; i++){
//            System.out.println(name + "_" + i);
//        }
        System.out.println(name);
//        System.out.println(Thread.activeCount());
    }
}
