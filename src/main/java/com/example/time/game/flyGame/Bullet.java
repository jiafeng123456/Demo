package com.example.time.game.flyGame;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/31 0031 16:07
 */
public class Bullet extends FlyingObject {
    private int speed = 3; //移动的速度
    /** 构造方法 子弹的初始坐标随着英雄机定*/
    public Bullet(int x,int y){
        image = ShootGame.bullet; //图片
        width = image.getWidth();   //宽
        height = image.getHeight(); //高
        this.x = x; //x:随英雄机
        this.y = y; //y:随英雄机
    }
}
