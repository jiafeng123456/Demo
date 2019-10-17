package com.example.time.controller;

/*
 *@author jiafeng
 *@date 2019/8/13 0013 16:34
 */

import com.example.time.dao.response.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("杨胜军",23,'男'));
        userList.add(new User("杨胜军",23,'男'));
        userList.add(new User("杨胜军",22,'女'));
        userList.add(new User("杨胜军",23,'女'));
        userList.add(new User("黄海明",23,'男'));
        userList.add(new User("黄海明",22,'男'));
        userList.add(new User("黄海明",22,'女'));
        userList.add(new User("黄海明",23,'女'));
        userList.add(new User("赵忠有",23,'男'));
        userList.add(new User("赵忠有",22,'男'));
        userList.add(new User("赵忠有",22,'女'));
        userList.add(new User("赵忠有",23,'女'));


//        Map<String,Map<Integer,Long>> bo = userList.stream().collect(Collectors.groupingBy(User::getName,Collectors.groupingBy(User::getAge,Collectors.counting())));

        Map<String,Map<Integer,Long>> boxBarcodeMap = userList.stream().collect(Collectors.groupingBy(User::getName, Collectors.groupingBy(User::getAge,Collectors.counting())));

//        for (Map.Entry<String,Map<Integer,Long>> childMap : boxBarcodeMap.entrySet()) {
//            System.out.print("姓名:" + childMap.getKey());
//            for (Map.Entry<Integer,Long> item : childMap.getValue().entrySet()) {
//                System.out.print(" \t 年龄:" + item.getKey() + " \t 数量:" + item.getValue());
//            }
//            System.out.print("\n");
//        }
/*


















 */
        boxBarcodeMap.values().stream().forEach(s->s.entrySet().stream().map(c->c.getValue()).forEach(System.out::println));



//        boxBarcodeMap.entrySet().forEach(x ->{
//            System.out.print("姓名:" + x.getKey());
//            x.getValue().entrySet().forEach(u-> {System.out.print(" \t 年龄:" + u.getKey() + " \t 数量:" + u.getValue());});
//            System.out.println("\n");
//        });
    }

}