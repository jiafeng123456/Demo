package com.example.time.game.flyGame;

import java.util.Random;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/31 0031 16:08
 */
public class Airplane extends FlyingObject implements Enemy {
    private int speed = 2; //移动的速度
    /** 构造方法 */
    public Airplane(){
        image = ShootGame.airplane; //图片
        width = image.getWidth();   //宽
        height = image.getHeight(); //高
        Random rand = new Random(); //随机数对象
        x = rand.nextInt(ShootGame.WIDTH-this.width); //x:0到(窗口宽-敌机宽)之间的随机数
        y = -this.height; //y:负的敌机的高
    }

    /** 重写getScore()得分 */
    public int getScore(){
        return 5; //打掉一个敌机得5分
    }
}
