package com.example.time.leetcode;

/*
 *@description:给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
示例:
X X X X
X O O X
X X O X
X O X X
运行你的函数后，矩阵变为：
X X X X
X X X X
X X X X
X O X X
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/surrounded-regions
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *@author jiafeng
 *@date 2019/12/12 0012 13:20
 */
public class Solve {

    public static void main(String[] args) {
        char[][] board = {{'X','X','X','X'},
                            {'X','X','X','X'},
                            {'X','X','X','X'},
                            {'X','X','X','X'}};

    }

    public static void solve(char[][] board) {
        int row = board.length;
        int colm = board[0].length;
        for (int i = 1 ; i < row - 1 ; i++){
            for (int j =1 ; j <colm - 1 ; j++){
            }
        }
    }
}
