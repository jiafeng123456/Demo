package com.example.time.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/21 0021 14:02
 */
public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }


    public static int findDuplicate(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.get(i) != null){
                return i;
            }else {
                map.put(i,1);
            }
        }
        return 0;
    }
}
