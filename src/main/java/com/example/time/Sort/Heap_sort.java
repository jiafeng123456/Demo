package com.example.time.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *@author jiafeng
 *@date 2019/8/12 0012 15:53
 */
public class Heap_sort {
    public static void main(String[] args) {
        int[] a = {0,5,7,4,3,1,2};
        for (int c :heapSort(a)){
            System.out.println(c);
        }
    }

    static int length;
    public static int[] heapSort(int[] a){
        length = a.length;
        if (length<1){
            return a;
        }
        buildMaxHeap(a);
        while (length>0){
            int temp = a[0];
            a[0] = a[length-1];
            a[length-1] = temp;
            length--;
            adjustHeap(a,0);
        }
        return a;
    }

    public static void buildMaxHeap(int[] a){
        for (int i = (length-1)/2;i>=0;i--){
            adjustHeap(a,i);
        }
    }

    public static void adjustHeap(int[] a,int i){
        int maxIndex = i;
        if (i * 2 < length && a[i * 2] > a[maxIndex]){
            maxIndex = i * 2;
        }
        if (i * 2 + 1 < length && a[i * 2 +1] > a[maxIndex]){
            maxIndex = i * 2 + 1;
        }
        if (maxIndex != i){
            int temp = a[maxIndex];
            a[maxIndex] = a[i];
            a[i] = temp;
            adjustHeap(a,maxIndex);
        }
    }
}
