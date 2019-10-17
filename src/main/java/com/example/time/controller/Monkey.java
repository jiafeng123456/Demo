package com.example.time.controller;

import java.util.ArrayList;
import java.util.List;

/*
 *@description:
 *@author jiafeng
 *@date 2019/9/27 0027 10:23
 */
public class Monkey {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int n = 15;
        for (int i = 0 ; i < n ; i++){
            a.add(i) ;
        }
        System.out.println("猴王"+MonkeyKing(a,8,0));
    }

    public static int MonkeyKing(List<Integer> a,int m,int index){
        int count = a.size();
        int king = 0;
        if (count == 1){
            king = a.get(index);
        }
        index = (index + m - 1) % count;
        System.out.println(a.get(index)+"猴子出局");
        a.remove(index);
        MonkeyKing(a,m,index);
        return king;
    }
}
