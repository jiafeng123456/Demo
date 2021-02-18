package com.example.time.Thread.ThreadOne;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/30 0030 17:01
 */
public class ThreadConsumer extends Thread{
    private ThreadOneModel threadOneModel;

    public ThreadConsumer(ThreadOneModel threadOneModel){
        this.threadOneModel = threadOneModel;
    }

    @Override
    public void run(){
        try {
            threadOneModel.delMessage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
