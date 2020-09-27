package com.example.time.leetcode;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/21 0021 15:04
 */
public class isValid {

    public static void main(String[] args) {

    }
    public static boolean isValid(String s) {
        if (s.indexOf("abc") != -1){
            s.replace("abc","");
        }
        return "".equals(s);
    }
}
