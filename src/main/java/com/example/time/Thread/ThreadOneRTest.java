package com.example.time.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/28 0028 14:21
 */
public class ThreadOneRTest {

//    public static void main(String[] args) throws InterruptedException {
//        ThreadOneRModel threadOneRModel = new ThreadOneRModel();
//        CountDownLatch countDownLatch = new CountDownLatch(100);
//        for (int i = 1 ; i <= 100 ; i++){
//            ThreadOneR threadOneR = new ThreadOneR(threadOneRModel, countDownLatch, 1);
//            threadOneR.start();
////            System.out.println(threadOneR.getName());
////            threadOneR.join();
////            threadOneR.run();
////            System.out.println(countDownLatch.getCount());
//        }
////        System.out.println("开始");
////        countDownLatch.await();
//        Thread.sleep(1000);
////        if (countDownLatch.getCount() == 0){
//            System.out.println("balance = " + threadOneRModel.getBalance());
////        }
//    }

//    public static void main(String[] args) throws InterruptedException {
//        ThreadTwoIT threadTwoIT = new ThreadTwoIT("thread1");
//        ThreadTwoIT threadTwoIT1 = new ThreadTwoIT("thread2");
//        ThreadTwoIT threadTwoIT2 = new ThreadTwoIT("thread3");
//        threadTwoIT.start();
////        threadTwoIT.run();
////        threadTwoIT1.run();
////        threadTwoIT2.run();
////        threadTwoIT.isAlive();
//
//        threadTwoIT1.start();
////        threadTwoIT.join();
////        threadTwoIT1.join();
//        threadTwoIT2.start();
//        System.out.println(threadTwoIT.isAlive());
//        System.out.println(threadTwoIT1.isAlive());
//        System.out.println(threadTwoIT2.isAlive());
////        threadTwoIT2.join();
//    }
    public static void main(String[] args) {
        ThreadOneRModel account = new ThreadOneRModel();
        CountDownLatch countDownLatch = new CountDownLatch(100);
        ExecutorService service = Executors.newFixedThreadPool(100);

        for(int i = 1; i <= 100; i++) {
            service.submit(new ThreadOneR(account, countDownLatch,1));
        }

        service.shutdown();

        while(!service.isTerminated()) {}

        System.out.println("账户余额: " + account.getBalance());
    }
}
