package com.example.time.Gof.Prototype.test;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/18 0018 13:17
 */
public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("贾锋","：获得三好学生,","杭州电子科技大学信息工程学院");
        citation.display();
        Citation citation1 = (Citation) citation.clone();
        citation1.setName("朱秋艳");
        citation1.display();
    }
}
class Citation implements  Cloneable{
    String name;
    String info;
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void display(){
        System.out.println(name+info+college);
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状复制成功");
        return super.clone();
    }
}
