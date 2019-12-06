package com.example.time.leetcode;

/*
 *@description:给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *@author jiafeng
 *@date 2019/10/21 0021 16:46
 */
public class IsPowerOfThree {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }
    public static boolean isPowerOfThree(int n) {
        int m = n%3;
        while (m==0){
            if (n==1){
                return true;
            }else {
                m=n%3;
                n=n/3;
            }
        }
        return false;
    }
}
