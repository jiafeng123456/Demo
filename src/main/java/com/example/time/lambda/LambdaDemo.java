package com.example.time.lambda;

import com.example.time.dao.model.User;
import com.example.time.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/28 0028 16:10
 */
public class LambdaDemo {
    private static Map<String, Employee> map1 = new HashMap<>();
    private static Map<String, Employee> map2 = new HashMap<>();

    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        //players.forEach(System.out::println);
        players.forEach(player -> System.out.println(player));

    }

}
