package com.example.time.test;

import com.example.time.model.Employee;

/*
 *@description:
 *@author jiafeng
 *@date 2021/1/12 0012 09:36
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        String str1 = "通话";
        String str2 = "重地";
        System.out.println(String.format("str1：%d | str2：%d",  str1.hashCode(),str2.hashCode()));
        System.out.println(str1.equals(str2));
    }
}
