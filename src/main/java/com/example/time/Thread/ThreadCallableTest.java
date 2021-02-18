package com.example.time.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/30 0030 14:30
 */
public class ThreadCallableTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<String> task = service.submit(new ThreadCallable());
        Thread.sleep(1000);
        String retn = task.get();
        //关闭线程池
        service.shutdown();
        System.out.println(retn + "--end main thread");

    }
}
