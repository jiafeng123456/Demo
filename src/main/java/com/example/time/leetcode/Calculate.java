package com.example.time.leetcode;

/*
 *@description:LCP 17. 速算机器人
 * 小扣在秋日市集发现了一款速算机器人。店家对机器人说出两个数字（记作 x 和 y），请小扣说出计算指令
 * "A" 运算：使 x = 2 * x + y；
 * "B" 运算：使 y = 2 * y + x。
 * 在本次游戏中，店家说出的数字为 x = 1 和 y = 0，小扣说出的计算指令记作仅由大写字母 A、B 组成的字符串 s，字符串中字符的顺序表示计算顺序，请返
 * 回最终 x 与 y 的和为多少。
 *@author jiafeng
 *@date 2020/10/10 0010 13:16
 */
public class Calculate {

    public static void main(String[] args) {
        System.out.println(calculate("AB"));
    }

    public static int calculate(String s) {
        int x = 1,y = 0;
        for (int i = 0 ; i < s.length() ; i++){
            switch (s.charAt(i)){
                case 'A' :
                    x = 2 * x + y;
                    break;
                case 'B' :
                    y = 2 * y + x;
                    break;
            }
        }
        return x+y;
    }
}
