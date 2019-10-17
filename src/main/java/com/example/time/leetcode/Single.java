package com.example.time.leetcode;

/*
 *@description:
 *@author jiafeng
 *@date 2019/9/27 0027 13:21
 */
public class Single {
    public static void main(String[] args) {
        int rows = 10;

        for (int i = 0; i < rows; i++) {
            int number = 1;
            // 打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
