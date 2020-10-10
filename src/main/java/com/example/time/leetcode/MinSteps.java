package com.example.time.leetcode;

/*
 *@description:1347. 制造字母异位词的最小步骤数
 *给你两个长度相等的字符串 s 和 t。每一个步骤中，你可以选择将 t 中的 任一字符 替换为 另一个字符。
 * 返回使 t 成为 s 的字母异位词的最小步骤数。
 * 字母异位词 指字母相同，但排列不同（也可能相同）的字符串。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-number-of-steps-to-make-two-strings-anagram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *@author jiafeng
 *@date 2020/10/10 0010 14:28
 */
public class MinSteps {

    public static void main(String[] args) {
        System.out.println(minSteps("aba", "bab"));
    }

    public static int minSteps(String s, String t) {
        int [] S=new int[26];
        int [] T=new int[26];
        for (int i=0;i<s.length();i++){
            S[s.charAt(i)-'a']++;
        }
        for (int i=0;i<t.length();i++){
            T[t.charAt(i)-'a']++;
        }
        int ss=0,tt=0;
        for (int i=0;i<26;i++){
            if (S[i]>T[i])
                ss+=S[i]-T[i];
            else
                tt+=T[i]-S[i];
        }
        return Math.min(ss,tt);
    }
}
