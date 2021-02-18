package com.example.time.Sort;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/22 0022 16:25
 */
public class Quick_sort_three {

    public static void main(String[] args) {
        int[] a = {0,5,7,4,3,1,2};
        int lo = 0;
        int hi = a.length-1;
        for (int c :quickSort(a,lo,hi)){
            System.out.println(c);
        }

    }

    public static int getMid(int[] a , int lo, int hi){
        int key = a[lo];
        while (lo < hi){
            while (key < a[hi]){
                hi--;
            }
            a[lo] = a[hi];
            while (key > a[lo]){
                lo++;
            }
            a[hi] = a[lo];
        }
        a[hi] = key;
        return hi;
    }

    public static int[] quickSort(int[] a, int lo, int hi){
        if (lo<hi){
            int index = getMid(a,lo,hi);
            quickSort(a, lo, index-1);
            quickSort(a,index+1, hi);
        }
        return a;
    }
}
