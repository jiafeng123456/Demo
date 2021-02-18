package com.example.time.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/29 0029 16:36
 */
public class ThreadRTestOne {

    public static void main(String[] args) {
        ThreadOneRModel threadOneRModel = new ThreadOneRModel();
        ThreadOneRModelTwo threadOneRModel1 = new ThreadOneRModelTwo();
        CountDownLatch countDownLatch = new CountDownLatch(10000);

        for (int i = 0 ; i < 10000 ; i++){
            ThreadOneR threadOneR = new ThreadOneR(threadOneRModel, countDownLatch, 1);
            threadOneR.start();
            ThreadOneRTwo threadOneRTwo = new ThreadOneRTwo(threadOneRModel1, countDownLatch, 1);
            threadOneRTwo.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadOneRModel.getBalance());
        System.out.println(threadOneRModel1.getBalance());
    }

//    public static void main(String[] args) {
//        ThreadOneRModel threadOneRModel = new ThreadOneRModel();
//        ExecutorService executorService = Executors.newFixedThreadPool(100);
//        CountDownLatch countDownLatch = new CountDownLatch(100);
//        for (int i = 0 ; i < 100 ; i++){
//            executorService.execute(new ThreadOneR(threadOneRModel, countDownLatch,1));
//        }
//        executorService.shutdown();
//        while (!executorService.isTerminated()){
//
//        }
//        System.out.println(threadOneRModel.getBalance());
//    }
}
