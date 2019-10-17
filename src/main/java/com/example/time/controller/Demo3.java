package com.example.time.controller;

import com.example.time.dao.model.Generic;
import org.apache.commons.logging.Log;
import org.apache.poi.ss.formula.functions.T;

import java.io.Console;
import java.net.URL;
import java.util.*;
import java.util.stream.IntStream;

/*
 *@author jiafeng
 *@date 2019/8/14 0014 15:45
 */
public class Demo3 {
    public static void main(String[] args) {
        Generic a = new Generic("aaaaa");
        Generic b = new Generic(1);
        Generic c = new Generic(false);

        System.out.println(a.getKey());
        System.out.println(b.getKey());
        System.out.println(c.getKey());
    }
}
