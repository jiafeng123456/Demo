package com.example.time.test;

import java.math.BigDecimal;

/*
 *@description:
 *@author jiafeng
 *@date 2019/10/25 0025 14:15
 */
public class sort {
    public static void main(String[] args) {
       String[] a = {"10","30","20"};
       String[] b = fixedAmount(a,"29");
       String c = getMaxAmount("20","20");
        System.out.println(c);
    }

    public static String[] fixedAmount(String[] amount,String redpack_left_money){
//        for (int i = 0 ;i<amount.length;i++){
//            for (int j = 0;j<amount.length-1-i;j++){
//                if (new BigDecimal(amount[j]).compareTo(new BigDecimal(amount[j+1]))==1){
//                    String p = amount[j];
//                    amount[j] = amount[j+1];
//                    amount[j+1] = p;
//                }
//            }
//        }
        for (int i = 0;i<amount.length-1;i++){
            BigDecimal c =new BigDecimal(amount[i+1]);
            int j = i;
            while (c.compareTo(new BigDecimal(amount[j]))==1){
                amount[j+1]=amount[j];
                j--;
            }
            amount[j+1]=c.toString();
        }
        if (new BigDecimal(amount[amount.length-1]).compareTo(new BigDecimal(redpack_left_money))==1){
            return amount;
        }else {
            int size =amount.length;
            for (int i = amount.length-1;i>=0;i--){
                if (new BigDecimal(amount[i]).compareTo(new BigDecimal(redpack_left_money))==1){
                    size--;
                }
            }
            String[] fixedAmount = new String[size];
            for (int i = 0 ; i < fixedAmount.length;i++){
                fixedAmount[i] = amount[i];
            }
            return fixedAmount;
        }
    }

    public static String getMaxAmount(String amountMax,String redpack_left_money){
        String max = null;
        if (new BigDecimal(amountMax).compareTo(new BigDecimal(redpack_left_money))==-1){
            max = amountMax;
        }else {
            max = redpack_left_money;
        }
        return max;
    }
}
