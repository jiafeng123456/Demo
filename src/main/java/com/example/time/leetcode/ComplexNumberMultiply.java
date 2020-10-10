package com.example.time.leetcode;

/*
 *@description:
 * 给定两个表示复数的字符串。
 * 返回表示它们乘积的字符串。注意，根据定义 i2 = -1 。
 * 输入字符串不包含额外的空格。
 * 输入: "1+1i", "1+1i"
 * 输出: "0+2i"
 * 解释: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i ，你需要将它转换为 0+2i 的形式。
 * 输入字符串将以 a+bi 的形式给出，其中整数 a 和 b 的范围均在 [-100, 100] 之间。输出也应当符合这种形式。
 *@author jiafeng
 *@date 2020/10/9 0009 16:53
 */
public class ComplexNumberMultiply {

    public static void main(String[] args) {
        System.out.println(complexNumberMultiply("1+-1i","0+0i"));
    }

    public static String complexNumberMultiply(String a, String b) {
        String[] aArr = a.split("\\+|i");
        String[] bArr = b.split("\\+|i");
        Integer oneNum = Integer.valueOf(aArr[0]) * Integer.valueOf(bArr[0]);
        Integer twoNum = Integer.valueOf(aArr[1]) * Integer.valueOf(bArr[1]);
        Integer threeNum = Integer.valueOf(aArr[0]) * Integer.valueOf(bArr[1]) + Integer.valueOf(bArr[0]) * Integer.valueOf(aArr[1]);
        String str = (oneNum - twoNum) + "+" + threeNum + "i";
        return str;
    }
}
