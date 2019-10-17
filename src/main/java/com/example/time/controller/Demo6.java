package com.example.time.controller;

/*
 *@author jiafeng
 *@date 2019/8/22 0022 16:39
 */
public class Demo6 {
    public static void main(String[] args) {
        String str= "my heart will go on";
        System.out.println(replaceSpace(str));
    }

    public static int replaceSpace(String str) {
        String[] s = str.split(" ");
        int i = s.length-1;
        char[] c = s[i].toCharArray();
        int j = c.length;


        return j;

    }
}
