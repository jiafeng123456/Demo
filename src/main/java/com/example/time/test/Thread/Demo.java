package com.example.time.test.Thread;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/16 0016 09:59
 */
@Service
public class Demo {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread A = new Thread(myThread,"A");
        Thread B = new Thread(myThread,"B");
        Thread C = new Thread(myThread,"C");
        Thread D = new Thread(myThread,"D");
        Thread E = new Thread(myThread,"E");
        A.start();
        B.start();
//        A.sleep(10);
        C.start();
        D.start();
        E.start();
    }
}
