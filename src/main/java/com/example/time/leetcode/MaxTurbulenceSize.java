package com.example.time.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 *@description:当 A 的子数组 A[i], A[i+1], ..., A[j] 满足下列条件时，我们称其为湍流子数组：
若 i <= k < j，当 k 为奇数时， A[k] > A[k+1]，且当 k 为偶数时，A[k] < A[k+1]；
或 若 i <= k < j，当 k 为偶数时，A[k] > A[k+1] ，且当 k 为奇数时， A[k] < A[k+1]。
也就是说，如果比较符号在子数组中的每个相邻元素对之间翻转，则该子数组是湍流子数组。
返回 A 的最大湍流子数组的长度。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-turbulent-subarray
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *@author jiafeng
 *@date 2019/12/10 0010 09:52
 */
public class MaxTurbulenceSize {

    public static void main(String[] args) {
//int[]  n = {9,4,2,10,7,8,8,1,9};
        int[] n = {9,9};
        System.out.println(maxTurbulenceSize(n));
    }
    /* 功能描述:
     * 〈〉
     * @param null
     * @return:
     * @Author: jiafeng
     * @Date: 2019/12/10 0010 09:52
     */
    public static int maxTurbulenceSize(int[] A) {
        int n = 1;
        if (A.length == 1 ){
            return 1;
        }
        List<Integer> list = new ArrayList<>();
        int tem = A[0];
        for (int i = 1 ; i < A.length ; i++){
            if (A[i] > tem){
                list.add(1);
            }else if (A[i] < tem){
                list.add(-1);
            }else {
                list.add(0);
            }
            tem = A[i];
        }
        int len = 1;
        int pre = list.get(0);
        for (int i = 1 ; i < list.size();i++){
            if (list.get(i) == 0){
                n = Math.max(len,n);
                len = 1;
                if (i+1 < list.size()){
                    pre = list.get(i+1);
                }else {
                    break;
                }
            }else {
                if (pre * list.get(i) == 1){
                    n = Math.max(n,len);
                    len = 1;
                    pre = list.get(i);
                }else {
                    pre = list.get(i);
                    len++;
                }
            }
        }
        n = Math.max(len,n);
        return n+1;
    }
}