package com.example.time.Gof.Prototype.test;

import java.util.HashMap;
import java.util.Scanner;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/18 0018 13:31
 */
public class ProtoTypeShape {
    public static void main(String[] args) {
        ProtoTypeManager p = new ProtoTypeManager();
        Circle circle = (Circle) p.getShape("Circle");
        circle.countArea();
        Square square = (Square) p.getShape("Square");
        square.countArea();
    }
}
interface Shape extends Cloneable{
    public Object clone();
    public void countArea();
}
class Circle implements Shape{

    @Override
    public Object clone() {
        Circle c = null;
        try {
            c = (Circle) super.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("克隆失败");
        }
        return c;
    }

    @Override
    public void countArea() {
        Scanner kc = new Scanner(System.in);
        System.out.print("这是一个圆，他的半径是：");
        int a = kc.nextInt();
        System.out.println("圆的面积为"+3.14*a*a);
    }
}
class Square implements Shape{

    @Override
    public Object clone() {
        Square s = null;
        try {
            s = (Square) super.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("克隆失败");
        }
        return s;
    }

    @Override
    public void countArea() {
        Scanner kc = new Scanner(System.in);
        System.out.print("这是一个正方形，他的边长是：");
        int a = kc.nextInt();
        System.out.println("正方形的面积为"+a*a);
    }
}

class ProtoTypeManager
{
    private HashMap<String, Shape>ht=new HashMap<String,Shape>();
    public ProtoTypeManager()
    {
        ht.put("Circle",new Circle());
        ht.put("Square",new Square());
    }
    public void addshape(String key,Shape obj)
    {
        ht.put(key,obj);
    }
    public Shape getShape(String key)
    {
        Shape temp=ht.get(key);
        return (Shape) temp.clone();
    }
}

