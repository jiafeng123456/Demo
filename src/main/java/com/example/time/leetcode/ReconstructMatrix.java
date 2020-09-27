package com.example.time.leetcode;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *@description:
 *@author jiafeng
 *@date 2020/8/28 0028 16:32
 */
public class ReconstructMatrix {

    public static void main(String[] args) {
        StringBuffer openingNode = new StringBuffer("a");
        StringBuffer a = new StringBuffer("a");
        System.out.println(StringUtils.isBlank(a));
        System.out.println(openingNode.deleteCharAt(openingNode.length()-1).toString());
    }

//    public static List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
//
//    }
}
