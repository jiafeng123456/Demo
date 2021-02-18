package com.example.time.Sort;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/22 0022 16:30
 */
public class Bubble_sort_two {
    public static void main(String[] args) {
        int[] a = {0,5,7,4,3,1,2};
        for (int c :bubbleSort(a)){
            System.out.println(c);
        }
    }

    public static int[] bubbleSort(int[] a){
        for (int i = 0 ; i < a.length; i++){
            for (int j = 0 ; j < a.length - 1 - i; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}
