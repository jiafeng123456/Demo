package com.example.time.Sort;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/22 0022 14:09
 */
public class Quick_sort_two {

    public static void main(String[] args) {
        int[] a = {0,5,7,4,3,1,2};
        int lo = 0;
        int hi = a.length-1;
        for (int c :quick_sort(a,lo,hi)){
            System.out.println(c);
        }

    }

    public static int getMid(int[] arr, int lo, int li){
        int key = arr[lo];
        while (lo < li){
            while (key < arr[li]){
                li--;
            }
            arr[lo] = arr[li];
            while (key> arr[lo]){
                lo++;
            }
            arr[li] = arr[lo];
        }
        arr[li] = key;
        return li;
    }

    public static int[] quick_sort(int[] arr, int lo, int hi){
        if (lo < hi){
            int index = getMid(arr, lo, hi);
            quick_sort(arr, lo , index-1);
            quick_sort(arr, index+1, hi);
        }
        return arr;
    }
}
