package com.example.time.leetcode;

import org.apache.commons.lang3.StringUtils;

/*
 *@description:给定一个整数，将其转化为7进制，并以字符串形式输出
 *@author jiafeng
 *@date 2020/9/21 0021 14:16
 */
public class ConvertToBase7 {

    public static void main(String[] args) {
        int num = 100;
        System.out.println(convertToBase7(num));
    }

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        int numAbs = num < 0 ? -num : num;
        String result = "";
        while (numAbs != 0){
            result = numAbs % 7 + result;
            numAbs = numAbs/7;
        }
        if (num < 0 ){
            result = "-" + result;
        }
        return result;
    }
}
