package com.example.time.controller;

import java.util.ArrayList;
import java.util.List;

/*
 *@author jiafeng
 *@date 2019/8/19 0019 11:18
 */
public class Demo4 {
    public static void main(String[] args) {
//        int[][] matrix = {
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15},
//                {16,17,18,19,20},
//                {21,22,23,24,25}
//        };
        int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
//        int[][] matrix = {{1,2},{3,4},{5,6},{7,8},{9,10}};
//        int[][] matrix = {{1},{2},{3},{4},{5}};
//        int[][] matrix = {{1,2,3,4,5}};
        ArrayList<Integer> integers=printMatrix(matrix);
        integers.stream().forEach(System.out::println);
    }

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> integers = new ArrayList<>();
        int startR = 0;
        int startC = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        while (startR == startC && startC <= endC && startR <= endR) {
            if (startC==endC){
                for (int i = startC;i<=endR;i++){
                    integers.add(matrix[i][startC]);
                }
            }else if(startR==endR){
                for (int i =startR;i<=endC;i++){
                    integers.add(matrix[startR][i]);
                }
            }else {
                for (int i = startR; i <= endC; i++) {
                    integers.add(matrix[startR][i]);
                }
                for (int j = startR + 1; j <= endR; j++) {
                    integers.add(matrix[j][endC]);
                }
                for (int k = endC - 1; k >= startR; k--) {
                    integers.add(matrix[endR][k]);
                }
                for (int h = endR - 1; h > startR; h--) {
                    integers.add(matrix[h][startC]);
                }
            }
            startR++;
            startC++;
            endR--;
            endC--;
        }
        return integers;
    }
}
