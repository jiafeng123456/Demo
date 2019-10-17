package com.example.time.leetcode;

/*
 *@description:
 *@author jiafeng
 *@date 2019/9/27 0027 13:32
 */
public class Niu {

    public static void main(String[] args) {
        System.out.println(add(0));
    }

    public static int add(int n){
        int s1 = 0;
        int s2 = 1;
        if (n==0){
            return s1;
        }
        if (n==1){
            return s1+s2;
        }
        return add(n-1)+add(n-2);
    }
}
