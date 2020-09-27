package com.example.time.Gof.Prototype.test;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/18 0018 11:26
 */
class SunWukong extends JPanel implements Cloneable {

    public SunWukong() {
        String wpath = Objects.requireNonNull(this.getClass().getClassLoader().getResource("image/wukong.jpg").getPath());
        JLabel l1 = new JLabel(new ImageIcon(wpath));
        this.add(l1);
    }

    public Object clone() throws CloneNotSupportedException {
        SunWukong sunWukong = null;
        try {
            sunWukong = (SunWukong) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆失败");
        }
        return sunWukong;
    }

}
public class ProtoTypeWukong{
    public static void main(String[] args) throws CloneNotSupportedException {
        JFrame jf=new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(1,2));
        Container contentPane=jf.getContentPane();
        SunWukong obj1=new SunWukong();
        contentPane.add(obj1);
        SunWukong obj2=(SunWukong)obj1.clone();
        contentPane.add(obj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
