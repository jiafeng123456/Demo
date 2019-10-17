package com.example.time.controller;

import java.util.Scanner;

/*
 *@author jiafeng
 *@date 2019/9/2 0002 13:33
 */
public class Demo9 {
    public static void main(String[] args) {
        Scanner kc = new Scanner(System.in);
        System.out.println("请输入用户个数：");
        // 用户个数
        int p = kc.nextInt();
        System.out.println("请输入用户喜好：");
        //用户喜好
        int[] pl = new int[p];
        for (int i = 0;i<p;i++){
            pl[i] = kc.nextInt();
        }
        //查询组数
        System.out.println("请输入查询个数：");
        int n = kc.nextInt();
        //查询条件
        System.out.println("请输入查询条件：");
        int[][] nl = new int[n][3];
        for (int i = 0;i<n;i++){
            nl[i][0] =kc.nextInt();
            nl[i][1] =kc.nextInt();
            nl[i][2] =kc.nextInt();
        }

        for (int i = 0;i<n;i++){
            int count = 0 ;
            for (int j = nl[i][0]-1;j<nl[i][1]-1;j++){
                if (pl[j]==nl[i][2]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
