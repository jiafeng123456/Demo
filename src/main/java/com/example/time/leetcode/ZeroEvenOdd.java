//package com.example.time.leetcode;
//
//import java.util.function.IntConsumer;
//
///*
// *@description:1116. 打印零与奇偶数
// * 假设有这么一个类：
// * class ZeroEvenOdd {
// * public ZeroEvenOdd(int n) { ... }      // 构造函数
// * public void zero(printNumber) { ... }  // 仅打印出 0
// * public void even(printNumber) { ... }  // 仅打印出 偶数
// * public void odd(printNumber) { ... }   // 仅打印出 奇数
// * }
// * 相同的一个 ZeroEvenOdd 类实例将会传递给三个不同的线程：
// * 线程 A 将调用 zero()，它只输出 0 。
// * 线程 B 将调用 even()，它只输出偶数。
// * 线程 C 将调用 odd()，它只输出奇数。
// * 每个线程都有一个 printNumber 方法来输出一个整数。请修改给出的代码以输出整数序列 010203040506... ，其中序列的长度必须为 2n。
// *@author jiafeng
// *@date 2020/10/19 0019 09:27
// */
//public class ZeroEvenOdd {
//
//    private int n;
//
//    public ZeroEvenOdd(int n) {
//        this.n = n;
//    }
//
//    // printNumber.accept(x) outputs "x", where x is an integer.
//    public void zero(IntConsumer printNumber) throws InterruptedException {
//
//    }
//
//    public void even(IntConsumer printNumber) throws InterruptedException {
//
//    }
//
//    public void odd(IntConsumer printNumber) throws InterruptedException {
//
//    }
//}
//
//
//class TestDemo{
//
//    public static void main(String[] args) {
//        int n = 0;
//        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(n);
//        zeroEvenOdd.zero(n);
//    }
//}