package com.example.time.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/28 0028 14:21
 */
public class ThreadOneRModel {

    private double balance;
//    private static Lock lock = new ReentrantLock();

    public void deposit(double money){
        ThreadOneRModelTwo.lock.lock();
//        synchronized (this){
            double newBalance = balance + money;
            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
//        }
        ThreadOneRModelTwo.lock.unlock();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
