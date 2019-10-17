package com.example.time.dao.response;

/*
 *@author jiafeng
 *@date 2019/8/13 0013 16:36
 */
public class User {
    public User(String name, int age, char sex) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    private String name;
    private int age;
    private char sex;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}
