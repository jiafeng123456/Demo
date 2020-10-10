package com.example.time.leetcode;

/*
 *@description:640. 求解方程
 * 求解一个给定的方程，将x以字符串"x=#value"的形式返回。该方程仅包含'+'，' - '操作，变量 x 和其对应系数。
 * 如果方程没有解，请返回“No solution”。
 * 如果方程有无限解，则返回“Infinite solutions”。
 * 如果方程中只有一个解，要保证返回值 x 是一个整数。
 *@author jiafeng
 *@date 2020/10/10 0010 13:31
 */
public class SolveEquation {

    public static void main(String[] args) {
        System.out.println(solveEquation("x+5-3+x=6+x-2"));
    }

    public static String solveEquation(String equation) {
        String ret = null;
        try {
            String[] split = equation.split("=");
            String left = split[0];
            String right = split[1];
            int[] leftRet = splitVar(left);
            int[] rightRet = splitVar(right);
            int xNum = leftRet[0] - rightRet[0];
            int constNum = rightRet[1] - leftRet[1];
            if (xNum != 0) {
                return "x=" + constNum / xNum;
            }
            if (constNum == 0) {
                return "Infinite solutions";
            }
            return "No solution";
        } catch (Exception ex) {
            ret =  "No solution";
        }
        return ret;
    }

    public static int[] splitVar(String s){
        int sumX = 0;
        int sumS = 0;
        String[] arr = s.replace("-","+-").split("\\+");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("x")) {
                sumX++;
            } else if (arr[i].equals("-x")) {
                sumX--;
            } else if (arr[i].contains("x")) {
                sumX += Integer.valueOf(arr[i].substring(0, arr[i].length() - 1));
            } else if (!arr[i].equals("")) {
                sumS += Integer.valueOf(arr[i]);
            } else {
                continue;
            }
        }
        return new int[]{sumX, sumS};
    }
}
