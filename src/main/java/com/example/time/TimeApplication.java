package com.example.time;


import org.apache.poi.ss.formula.functions.T;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootApplication
public class TimeApplication {

    public static void main(String ... args){
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(c));
        System.out.println(b.compareTo(a));
        System.out.println(c.compareTo(a));
        System.out.println(c.compareTo(b));
    }
}

