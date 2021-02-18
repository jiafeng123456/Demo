package com.example.time.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 *@description:
 *@author jiafeng
 *@date 2021/1/11 0011 14:30
 */
public class dealPercentage {

    public static void main(String[] args) {
        String normal = "123";
        String abnormal = "246";
        //定义格式化起始位数
        String format="0.00";
        DecimalFormat dec = new DecimalFormat(format);
        String rate =  dec.format((double) Integer.valueOf(normal) / (Integer.valueOf(normal) + Integer.valueOf(abnormal))*100)+"%";
        System.out.println(rate);
    }

    public static String  division(int num1,int num2){
        String rate="0.00%";

        return rate;
    }
}
