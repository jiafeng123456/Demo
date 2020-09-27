package com.example.time.Gof.Singleton;

/*
 *@description:
 * 懒汉式单例
 * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例
 *@author jiafeng
 *@date 2019/12/18 0018 09:22
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){};//避免类在外部被实例化

    public static LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
