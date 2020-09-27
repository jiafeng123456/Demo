package com.example.time.test;

import com.example.time.TTest;
import com.example.time.dao.model.Student;
import com.example.time.dao.model.User;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/12 0012 16:33
 */
public class demo extends TTest<User> {

    private TTest tTest;

    public static void A(User a){

    }

    public static void main(String[] args) {
        String a = "-1111111111111111111111111111111111111111111111111111";

        System.out.println(String.valueOf(new BigDecimal(a).abs()));

    }
}
