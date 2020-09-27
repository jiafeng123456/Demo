package com.example.time.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/21 0021 11:06
 */
public class FindLongestWord {

    public static void main(String[] args) {
        String s = "aewfafwafjlwajflwajflwafj";
        String[] d1 =  {"apple","ewaf","awefawfwaf","awef","awefe","ewafeffewafewf"};
        List<String> d = Arrays.asList(d1);
        System.out.println(findLongestWord(s,d));
    }

    public static String findLongestWord(String s, List<String> d){
        String result = "";
        for (String dFor : d){
            StringBuffer demo = new StringBuffer();
            for (int i = 0,j=0 ; i < s.length() && j < dFor.length(); i++,j++){
                if (s.charAt(i) == dFor.charAt(j)){
                    demo.append(s.charAt(i));
                    continue;
                } else {
                    j--;
                }
            }
            if ((result.length() < demo.length() && demo.toString().equals(dFor)) || (result.length() == demo.length() && result.compareTo(demo.toString()) >= 1 && demo.toString().equals(dFor))){
                result = demo.toString();
            }
        }
        return result;
    }
}
