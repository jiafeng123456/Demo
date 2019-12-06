package com.example.time.leetcode;

import java.util.Arrays;

/*
 *@description:274. H指数
 * 给定一位研究者论文被引用次数的数组（被引用次数是非负整数）。编写一个方法，计算出研究者的 h 指数。
 * h 指数的定义: “h 代表“高引用次数”（high citations），一名科研人员的 h 指数是指他（她）的 （N 篇论文中）
 * 至多有 h 篇论文分别被引用了至少 h 次。（其余的 N - h 篇论文每篇被引用次数不多于 h 次。）”
 *@author jiafeng
 *@date 2019/10/31 0031 10:19
 */
public class HIndex {

    public static void main(String[] args) {
        int[] n = {0,1};
        System.out.println(hIndex(n));
    }


    public static int hIndex(int[] citations) {
        if(citations==null||citations.length==0){
            return 0;
        }
        Arrays.sort(citations);
        int res;
        for(int i=0,length=citations.length;i<length;i++){
            res=length-i;
            if(res<=citations[i]){
                return res;
            }
        }
        return 0;
    }
}
