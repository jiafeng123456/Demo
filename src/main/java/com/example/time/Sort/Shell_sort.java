package com.example.time.Sort;

/*
 *@author jiafeng
 *@date 2019/8/12 0012 14:43
 */
public class Shell_sort {
    public static void main(String[] args) {
        int[] a = {0,5,7,4,3,1,2};
        for (int c :shellSort(a)){
            System.out.println(c);
        }
    }

    public static int[] shellSort(int[] a){
        int temp,gap = a.length/2;
        while (gap>0) {
            for (int i = gap; i < a.length; i++) {
                temp = a[i];
                int preIndex = i-gap;
                while (preIndex >= 0 && a[preIndex] > temp) {
                    a[preIndex + gap] = a[preIndex];
                    preIndex -= gap;
                }
                a[preIndex+gap] = temp;
            }
            gap /= 2;
        }
        return a;
    }
}
