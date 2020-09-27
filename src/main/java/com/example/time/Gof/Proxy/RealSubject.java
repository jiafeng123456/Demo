package com.example.time.Gof.Proxy;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:56
 */
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("处理真实逻辑.........");
    }
}
