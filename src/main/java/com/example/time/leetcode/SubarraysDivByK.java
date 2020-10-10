package com.example.time.leetcode;

/*
 *@description:
 *974. 和可被 K 整除的子数组
 * 给定一个整数数组 A，返回其中元素之和可被 K 整除的（连续、非空）子数组的数目。
 *@author jiafeng
 *@date 2020/10/9 0009 17:17
 */
public class SubarraysDivByK {

    public static void main(String[] args) {
        int[] A ={4,5,0,-2,-3,1};
        int K = 5;
        System.out.println(subarraysDivByK(A, K));
    }

    public static int subarraysDivByK(int[] A, int K) {
        int n = 0;
        for (int i = 0 ; i < A.length ; i++){
            int sum = A[i];
            if (sum % K == 0)n++;
            for (int j = 1 ; j < A.length -i ; j++){
                sum += A[i+j];
                if (sum % K == 0)n++;
            }
        }
        return n;
    }
}
