package com.example.time.leetcode;

import java.util.Arrays;

/*
 *@description:给你两个整数数组 arr1 和 arr2，返回使 arr1 严格递增所需要的最小「操作」数（可能为 0）。
每一步「操作」中，你可以分别从 arr1 和 arr2 中各选出一个索引，分别为 i 和 j，0 <= i < arr1.length 和 0 <= j < arr2.length，然后进行赋值运算 arr1[i] = arr2[j]。
如果无法让 arr1 严格递增，请返回 -1。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/make-array-strictly-increasing
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
版权声明：本文为CSDN博主「Gavinjou大笨象」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/zzz805/article/details/100907632
 *@author jiafeng
 *@date 2019/12/10 0010 09:22
 */
public class MakeArrayIncreasing {

    public static void main(String[] args) {
        int[] arr1 = {1,5,3,6,7};
        int[] arr2 = {1,3,2,4};
        System.out.println(makeArrayIncreasing(arr1,arr2));
    }
    /* 功能描述:
     * 〈〉
     * @param null
     * @return:
     * @Author: jiafeng
     * @Date: 2019/12/10 0010 09:23
     */
    public static int makeArrayIncreasing(int[] arr1, int[] arr2) {
        int ans = -1;
        if(arr1 == null||arr2 == null || arr1.length == 0 || arr2.length == 0) return ans;

        int length = arr1.length;
        int dp[][] = new int[length + 1][length + 1];

        for(int i = 0; i < length + 1;i++) Arrays.fill(dp[i],Integer.MAX_VALUE);
        dp[0][0] = -1;

        // 排序
        Arrays.sort(arr2);

        for(int i = 1;i <= length;i++)
        {
            // 当前数字
            int index = i - 1;
            for(int j = 0; j <= i;j++)
            {
                if(arr1[index] > dp[j][i - 1])
                {
                    dp[j][i] = arr1[index];
                }


                if(j > 0)
                {
                    int tmp = upperBound(arr2,0,arr2.length - 1,dp[j - 1][i - 1]);
                    dp[j][i] = Math.min(dp[j][i],tmp);
                }


                if(i == length && dp[j][i] != Integer.MAX_VALUE)
                {
                    return j;
                }
            }
        }

        return -1;
    }

    public static int upperBound(int arr[],int l,int  r,int key)
    {
        while (l <= r)
        {
            int mid =(l + r) / 2;

            if(arr[mid] <= key) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        if(l >= arr.length||arr[l] <= key) return Integer.MAX_VALUE;//无效值

        return arr[l];
    }

}
