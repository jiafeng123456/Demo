package com.example.time.Sort;

/*
 *@author jiafeng
 *@date 2019/8/12 0012 14:24
 */
public class Insert_sort {
    public static void main(String[] args) {
        int[] a = {0,5,7,4,3,1,2};
        for (int c :insertSort(a)){
            System.out.println(c);
        }
    }
    public static int[] insertSort(int[] a){
        for (int i = 0;i<a.length-1;i++){
            int c = a[i+1];
            int j = i;
            while (c<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=c;
        }
        return a;
    }
}
