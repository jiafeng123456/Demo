package com.example.time.controller;

import java.util.HashMap;

/*
 *@author jiafeng
 *@date 2019/9/2 0002 14:16
 */
public class Solution {

    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
//        int area = 0;
//        int maxarea = 0;
//        for (int i = 0;i<height.length;i++){
//            for (int j = i+1;j<height.length;j++){
//                int width = j-i;
//                int hight = height[i]>height[j] ? height[j] : height[i];
//                area = width*hight;
//                if (maxarea<area){
//                    int temp = area ;
//                    area = maxarea;
//
//                    maxarea = temp;
//                }
//            }
//        }[1,8,6,2,5,4,8,3,7]
        int maxarea = 0;
        int lo = 0;
        int hi = height.length-1;
        while (lo<hi){
            int area = (hi-lo)*(height[lo]>height[hi] ? height[hi] : height[lo]);
            maxarea = maxarea>area ? maxarea : area;
            if (height[lo]>height[hi]){
                hi--;
            }else {
                lo++;
            }
        }
        return maxarea;
    }
}
