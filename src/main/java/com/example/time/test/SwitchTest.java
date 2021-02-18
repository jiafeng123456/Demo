package com.example.time.test;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/23 0023 18:48
 */
public class SwitchTest {

    public static void main(String[] args) {
        switchTets("1");
    }

    public static void switchTets(String a){
        switch (a){
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
            case "4":
                System.out.println("4");
            case "5":
                System.out.println("5");
            default:
                System.out.println("default");
        }
    }
}
