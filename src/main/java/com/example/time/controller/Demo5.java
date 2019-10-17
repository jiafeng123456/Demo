package com.example.time.controller;

/*
 *@author jiafeng
 *@date 2019/8/22 0022 16:18
 */
public class Demo5 {

    public static void main(String[] args) {
//        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
//        int target = 1;
//        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
//        int target = 15;
        int[][] array = {{}};
        int target = 16;
        System.out.println(Find(target,array));
    }

    public static boolean Find(int target, int [][] array) {
        int endR = array.length-1;
        int endC = array[0].length-1;
        if (endR<0||endC<0){
            return false;
        }
        for (int i = 0 ; i<=endR;i++){
            if (target<=array[i][endC]){
                if (target==array[i][endC]){
                    return true;
                }
                for (int j = 0;j<=endC;j++){
                    if (target == array[i][j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
