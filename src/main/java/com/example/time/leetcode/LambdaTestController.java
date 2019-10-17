package com.example.time.leetcode;

import com.example.time.dao.model.Person;

import java.util.ArrayList;
import java.util.List;

/*
 *@author jiafeng
 *@date 2019/8/13 0013 08:52
 */
public class LambdaTestController {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        for (int i = 0 ; i < 8 ;i++){
            Person p = new Person(i,"a"+i,i%2==0?"男":"女",i);
            personList.add(p);
        }

        List<Person> persons = personList;
        persons.stream().forEach(Person::getAge);

    }
}
