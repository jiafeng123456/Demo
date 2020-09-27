package com.example.time.Gof.Singleton;

/*
 *@description:
 * 饿汉式单例
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 *@author jiafeng
 *@date 2019/12/18 0018 09:29
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return instance;
    }
}
