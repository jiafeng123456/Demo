package com.example.time.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/21 0021 13:13
 */
public class demo {
    public static void main(String[] args) {
        String s = "bab";
        String[] d1 =  {"ba","ab","a","b"};
        List<String> d = Arrays.asList(d1);
        System.out.println(findLongestWord(s,d));
    }

    public static String findLongestWord(String s, List < String > d) {
        String str="";
        for(String sstr:d){
            for(int i=0,j=0;i<s.length()&&j<sstr.length();i++){
                if(s.charAt(i)==sstr.charAt(j)) j++;
                if(j==sstr.length()){
                    if(sstr.length()>str.length()||(sstr.length()==str.length()&&str.compareTo(sstr)>0))  str=sstr;
                }
            }
        }
        return str;
    }

}
