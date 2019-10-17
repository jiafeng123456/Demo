package com.example.time.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *@description:
 *@author jiafeng
 *@date 2019/10/17 0017 09:53
 */
public class findMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1,int[]nums2){
        List<Integer> nums3 = new ArrayList<>();
        double median = 0;
        for (int i = 0 ; i<nums1.length ; i++){
            nums3.add(nums1[i]);
        }
        for (int i = 0 ; i<nums2.length ; i++){
            nums3.add(nums2[i]);
        }
        Collections.sort(nums3);

        if ((nums1.length+nums2.length)%2==1){
            median = nums3.get((1+nums3.size())/2);
        }else {
            int size = nums3.size()/2-1;
            median = (double) (nums3.get(size)+nums3.get(size+1))/2;
        }
        return median;
    }
}
