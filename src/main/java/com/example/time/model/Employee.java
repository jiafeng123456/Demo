package com.example.time.model;

import lombok.Data;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/29 0029 08:54
 */
@Data
public class Employee {

    private Long id;
    private String name;

    public Employee(Long id, String name){
        this.id = id;
        this.name=name;
    }
}
