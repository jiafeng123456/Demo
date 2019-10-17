package com.example.time.controller;

import java.util.Scanner;

/*
 *@author jiafeng
 *@date 2019/8/23 0023 09:37
 */
public class Demo7 {

    public static void main(String[] args) {
        Scanner kc = new Scanner(System.in);
        int n = kc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = kc.nextInt();
        }
        for (int i = 0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if (a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        StringBuffer s=new StringBuffer();
        for (int i = 0;i<n;i++) {
            s.append(a[i]);
        }
        System.out.println(s.toString());
    }
}
