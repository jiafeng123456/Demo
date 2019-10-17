package com.example.time.leetcode;

import java.io.IOException;

/*
 *@description:
 *@author jiafeng
 *@date 2019/9/23 0023 10:49
 */
public class ExceptionTryCatchTest {
    public void doSomething() throws IOException{
        System.out.println("do somthing");
    }
    public static void main(String[] args){
        ExceptionTryCatchTest etct = new ExceptionTryCatchTest();
        try {
            etct.doSomething();
        } catch (IOException e) {

        } catch (Exception e) {

        }
    }
}
