package com.example.time.Sort;

/*
 *@author jiafeng
 *@date 2019/8/12 0012 14:04
 */
public class Selection_sort {
    public static void main(String[] args) {
        int[] a = {0,5,7,4,3,1,2};
        for (int c :selectionSort(a)){
            System.out.println(c);
        }
    }

    public static int[] selectionSort(int[] a){
        for (int i = 0;i<a.length;i++){
            int min = i;
            for (int j = i;j<a.length;j++){
                if (a[min]>a[j]){
                    min = j;
                }
            }
            int p = a[min];
            a[min] = a[i];
            a[i] = p;
        }
        return a;
    }
}
