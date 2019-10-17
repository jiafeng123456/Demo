package com.example.time.controller;

import java.util.Scanner;

/*
 *@author jiafeng
 *@date 2019/8/23 0023 09:53
 */
public class Demo8 {
    public static void main(String[] args) {
        Scanner kc = new Scanner(System.in);
        int n = kc.nextInt();
        int m = kc.nextInt();
        int[][] ni= new int [n][2];
        for (int i = 0 ;i<n;i++){
            ni[i][0] = kc.nextInt();
            ni[i][1] = kc.nextInt();
        }
        for (int i = 0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if (ni[i][0]>ni[j][0]){
                    int temp = ni[i][0];
                    ni[i][0] = ni[j][0];
                    ni[j][0] = temp;
                    int temp1 = ni[i][1];
                    ni[i][1] = ni[j][1];
                    ni[j][1] = temp1;
                }
            }
        }
        int[][] mi = new int[m][2];
        for (int i = 0;i<m;i++){
            mi[i][0] = kc.nextInt();
        }
        for (int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if (j==n-1?mi[i][0]>=ni[j][0]:mi[i][0]>=ni[j][0]&&mi[i][0]<ni[j][0]){
                    mi[i][1] = ni[j][1];
                    break;
                }
            }
        }
        for (int i = 0;i<m;i++){
            System.out.println(mi[i][1]);
        }
    }
}
