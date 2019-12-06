package com.example.time.leetcode;

/*
 *@description:50. Pow(x, n)
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数
 *@author jiafeng
 *@date 2019/10/31 0031 10:42
 */
public class MyPow {

    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }
    public static double myPow(double x, int n) {
        double res;
        if (n>0){
            res=1;
            while (n>0){
                res *= x;
                n--;
            }
        }else if (n<0){
             res=1;
             while (n<0){
                 res *= 1/x;
                 n++;
             }
        }else {
            res = 1;
        }
        return res;
    }
}
