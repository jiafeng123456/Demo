package com.example.time.Thread.ThreadOne;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *@description: 测试wait 与 notify
 *@author jiafeng
 *@date 2020/12/30 0030 17:14
 */
public class ThreadOneTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreadOneModel threadOneModel = new ThreadOneModel();
        ExecutorService serviceProvider = Executors.newFixedThreadPool(10);
        ExecutorService serviceConsumer = Executors.newFixedThreadPool(10);
        System.out.println("请选择消费还是生产，1消费，2生产，3查看");
        while (sc.hasNext()){
            int type = sc.nextInt();
            if (type == 1){
                //消费
                System.out.println("请输入消费多少条数据");
                int num = sc.nextInt();
                for (int i = 0 ; i < num ; i++){
                    serviceConsumer.execute(new ThreadConsumer(threadOneModel));
                }
            }else if(type == 2){
                //生产
                System.out.println("请输入生产多少条数据");
                int num = sc.nextInt();
                for (int i = 0 ; i < num ; i++){
                    serviceProvider.execute(new ThreadPrivoder(threadOneModel));
                }
            }else {
                System.out.printf("当前剩余%d条消息\n",threadOneModel.getAllMessage());
            }
        }
    }
}
