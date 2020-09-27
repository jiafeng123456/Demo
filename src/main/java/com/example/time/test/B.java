package com.example.time.test;

import java.math.BigDecimal;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/24 0024 16:51
 */
public class B {

    private static double e = 0.0000000001;
    public static void main(String[] args) {
        System.out.println(sqrt2());
    }
    public static double sqrt2(){
        double low = 1.4;
        double hi = 1.5;
        double mid = (low+hi)/2;
        while (hi-low>e){
            if (mid*mid>2){
                hi = mid;
            }else {
                low = mid;
            }
            mid = (low+hi)/2;
        }
        return mid;
    }
}
