package com.example.time.Gof.Prototype;

/*
 *@description:
 * 原型模式
 * 原型模式包含以下主要角色。
 * 抽象原型类：规定了具体原型对象必须实现的接口。
 * 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 * 访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 *@author jiafeng
 *@date 2019/12/18 0018 09:53
 */
public class Realizetype implements Cloneable{
    Realizetype(){
        System.out.println("原型创建成功");
    };

    public Object clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功");
        return (Realizetype)super.clone();
    }
}
