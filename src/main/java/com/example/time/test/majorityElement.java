package com.example.time.test;

import java.util.*;

/*
 *@description:
 *@author jiafeng
 *@date 2019/10/17 0017 13:20
 */
public class majorityElement {

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,2,2,2};
        majorityElement(nums);
        System.out.println(".");
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        HashSet<Integer> integerHashSet = new HashSet<>();
        Map<Integer,Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0 ; i <nums.length;i++){
            //元素去重
            integerHashSet.add(nums[i]);
        }
        for (Integer integer : integerHashSet){
            integerIntegerMap.put(integer,0);
        }
        for (int i = 0 ; i < nums.length;i++){
            Integer integer = integerIntegerMap.get(nums[i]);
            integerIntegerMap.put(nums[i],++integer);
        }
        int n = nums.length/3;
        for (Integer integer : integerHashSet){
            if (integerIntegerMap.get(integer)>n){
                integers.add(integer);
            }
        }
        return integers;
    }
}
