package com.example.time.Thread.ThreadOne;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/30 0030 17:02
 */
public class ThreadPrivoder extends Thread{

    private ThreadOneModel threadOneModel;

    public ThreadPrivoder(ThreadOneModel threadOneModel){
        this.threadOneModel = threadOneModel;
    }

    @Override
    public void run(){
        try {
            threadOneModel.addMessage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
