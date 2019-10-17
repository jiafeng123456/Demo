package com.example.time.controller;

/*
 *@description:
 *@author jiafeng
 *@date 2019/9/23 0023 09:42
 */
public class D {
    public static void main(String[] args) {
        System.out.println(a());
    }

    public static int a(){
        int b;
        try{
            int[] a = new int[2];
            System.out.println(a[2]);
        }catch (Exception e){
            b=3;
            return b;
        }finally {
            b = 2;
            System.out.println("2");
            return b;
        }

    }
}
