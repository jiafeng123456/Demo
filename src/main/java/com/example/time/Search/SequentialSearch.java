package com.example.time.Search;

/*
 *@author jiafeng
 *@date 2019/8/12 0012 17:13
 */
public class SequentialSearch {

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(sequentialSearch(a,7));
    }

    public static int sequentialSearch(int[] a,int b){
        int i = 0;
        for (int j = 0;j<a.length;j++){
            if (a[j] == b){
                i=j;
            }else{
                return -1;
            }
        }
        return i;
    }
}
