package com.example.time.Sort;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/22 0022 16:37
 */
public class Selector_sort_two {
    public static void main(String[] args) {
        int[] a = {0,5,7,4,3,1,2};
        for (int c :selectionSort(a)){
            System.out.println(c);
        }
    }

    public static int[] selectionSort(int[] a){
        for (int i = 0 ; i < a.length ; i++){
            int min = i;
            for (int j = i ; j < a.length ; j++){
                if (a[min] > a[j]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }
}
