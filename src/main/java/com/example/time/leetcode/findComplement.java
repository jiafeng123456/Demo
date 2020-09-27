package com.example.time.leetcode;

/*
 *@description:
给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
注意:
给定的整数保证在32位带符号整数的范围内。
你可以假定二进制数不包含前导零位。
 *@author jiafeng
 *@date 2019/12/12 0012 14:25
 */
public class findComplement {

    public static void main(String[] args) {
        findComplement(5);
    }

    public static int findComplement(int num) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < 32; i++){
            sBuilder.append(num & 1);
            num = num >>> 1;
        }
        int index = sBuilder.reverse().indexOf("1");
        String numString = sBuilder.substring(index);
        String[] n = numString.split("");
        String[] m = new String[n.length];
        for (int i = 0 ; i < n.length ; i++){
            if (n[i].equals("0")){
                m[i]="1";
            }else {
                m[i]="0";
            }
        }
        int sum = 0;
        int c = m.length-1;
        for (int j = 0 ; j < m.length ; j++){
            sum +=Integer.parseInt(m[j]) * Math.pow(2,c);
            c--;
        }
        return sum;
    }
}
