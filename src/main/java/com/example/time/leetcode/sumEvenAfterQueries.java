package com.example.time.leetcode;

/*
 *@description:给出一个整数数组 A 和一个查询数组 queries。
对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
（此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sum-of-even-numbers-after-queries
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *@author jiafeng
 *@date 2019/12/6 0006 16:07
 */
public class sumEvenAfterQueries {
    /*
     * @Description 标准解法
     * @author jiafeng
     * @date 2019/12/6 0006
     */
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int S = 0;
        for (int a : A){
            if (a % 2 == 0){
                S += a;
            }
        }
        int[] ans = new int[queries.length];
        for (int i = 0 ; i < queries.length;++i){
            int val = queries[i][0];
            int index = queries[i][1];
            if (A[index] % 2 == 0) S -= A[index];
            A[index] += val;
            if (A[index] % 2 == 0) S += A[index];
            ans[i] = S;
        }
        return ans;
    }

//    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
//        int S = 0;
//        for (int a : A){
//            if (a % 2 == 0){
//                S += a;
//            }
//        }
//        int[] ans = new int[queries.length];
//        for (int i = 0 ; i < queries.length;++i){
//            int val = queries[i][0];
//            int index = queries[i][1];
//            if (A[index] % 2 == 0) S -= A[index];
//            A[index] += val;
//            if (A[index] % 2 == 0) S += A[index];
//            ans[i] = S;
//        }
//        return ans;
//    }
}
