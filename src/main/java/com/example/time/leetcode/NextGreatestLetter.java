package com.example.time.leetcode;

/*
 *744. 寻找比目标字母大的最小字母
 * 给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
 *@author jiafeng
 *@date 2019/10/31 0031 10:01
 */
public class NextGreatestLetter {

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'g';
        System.out.println(nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int i = 0;
        while (i<letters.length){
            if (target<letters[i]){
                return letters[i];
            }else {
                i++;
            }
        }
        return letters[0];
    }


}
