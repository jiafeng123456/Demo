package com.example.time.test;

import java.util.ArrayList;
import java.util.List;

/*
 *@description:
 *@author jiafeng
 *@date 2019/10/17 0017 14:58
 */
public class sumSubarrayMins {

    public static void main(String[] args) {
        String S = "0110";
        int N = 3;
        System.out.println(queryString(S,N));
    }
    public static boolean queryString(String S, int N) {

        for (int i = 1 ; i <=N;i++){
            if (S.indexOf(Integer.toBinaryString(i)) == -1){
                return false;
            }
        }
        return true;
    }
}
