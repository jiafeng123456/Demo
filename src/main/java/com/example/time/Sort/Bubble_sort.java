package com.example.time.Sort;

/*
 *@author jiafeng
 *@date 2019/8/12 0012 13:52
 */
public class Bubble_sort {
    public static void main(String[] args) {
        int[] a = {0,5,7,4,3,1,2};
        for (int c :bubbleSort(a)){
            System.out.println(c);
        }
    }

    public static int[] bubbleSort(int[] a){
        for (int i = 0 ;i<a.length;i++){
            for (int j = 0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    int p = a[j];
                    a[j] = a[j+1];
                    a[j+1] = p;
                }
            }
        }
        return a;
    }
}
