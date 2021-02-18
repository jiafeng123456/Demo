package com.example.time.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/28 0028 14:21
 */
public class ThreadOneRModelTwo {

    private double balance;
    public static Lock lock = new ReentrantLock();

    public void deposit(double money){
        lock.lock();
//        synchronized (this){
            double newBalance = balance + money;
            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
//        }
        lock.unlock();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
