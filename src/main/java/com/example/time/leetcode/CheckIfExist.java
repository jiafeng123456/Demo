package com.example.time.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 *@description:1346. 检查整数及其两倍数是否存在
 * 给你一个整数数组 arr，请你检查是否存在两个整数 N 和 M，满足 N 是 M 的两倍（即，N = 2 * M）。
更正式地，检查是否存在两个下标 i 和 j 满足：
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/check-if-n-and-its-double-exist
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *@author jiafeng
 *@date 2020/9/27 0027 19:38
 */
public class CheckIfExist {

    public static void main(String[] args) {
        int[] arr = {5,5};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < arr.length ; i++){
            map.put(arr[i], i);
        }
        for (int i = 0 ; i < arr.length ; i++){
            if (map.containsKey(arr[i]*2) && map.get(arr[i]*2) != i){
                return true;
            }
        }
        return false;
    }
}
