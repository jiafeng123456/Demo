package com.example.time.Gof.Proxy;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:57
 */
public class Proxy implements Subject {
    private RealSubject realSubjectl;
    @Override
    public void Request() {
        if (realSubjectl == null) {
            realSubjectl = new RealSubject();
        }
        proxyAfter();
        realSubjectl.Request();
        proxyBefore();
    }

    private void proxyAfter(){
        System.out.println("真实操作之前预处理.........");
    }

    private void proxyBefore(){
        System.out.println("真实操作之后预处理.........");
    }
}
