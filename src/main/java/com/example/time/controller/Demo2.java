package com.example.time.controller;

/*
 *@author jiafeng
 *@date 2019/8/14 0014 13:08
 */
public class Demo2 {

    public static void main(String[] args) {
        System.out.println(uglyNumber(7));
    }

    public static int uglyNumber(int number) {
        if (number <= 0) {
            return 0;
        }
        int[] arr = new int[number];
        arr[0] = 1;
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int nextNumber = 1;
        while (nextNumber < number) {
            int min = Math.min(Math.min(arr[temp1] * 2, arr[temp2] * 3), arr[temp3] * 5);
            arr[nextNumber] = min;

            while (arr[temp1] * 2 <= min) {

                temp1++;
            }
            while (arr[temp2] * 3 <= min) {
                temp2++;
            }
            while (arr[temp3] * 5 <= min) {
                temp3++;
            }
            nextNumber++;
        }
        return arr[number - 1];
    }
    /*








    */
}
