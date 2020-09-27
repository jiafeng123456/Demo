package com.example.time.test;

/*
 *@description:我现在要合并两组数据，要把第二组的每一条，插入到第一组的每一条，
 * 比如第一组有A,B,C三条数据，第二组有a,b,c三条数据，最后要变成一个数组Aa,Bb,Cc,我应该怎么做，求大神
 *@author jiafeng
 *@date 2019/12/6 0006 15:00
 */
public class addArray {
    public static void main(String[] args) {
        String[] array1 = {"A","B","C"};
        String[] array2 = {"a","b","c"};
        String[] array3 = new String[array1.length];
        for (int i = 0 ; i < array1.length; i++){
            array3[i] = array1[i] + array2[i];
        }
        for (String a : array3){
            System.out.println(a);
        }
    }
}
