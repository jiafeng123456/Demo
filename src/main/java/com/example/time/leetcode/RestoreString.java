package com.example.time.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 *@description:
 *@author jiafeng
 *@date 2020/8/26 0026 18:41
 */
public class RestoreString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] bb = new char[indices.length];
        for (int i = 0 ; i < indices.length ; i++){
            bb[indices[i]] = s.charAt(i);
        }
        return new String(bb);
    }
}
