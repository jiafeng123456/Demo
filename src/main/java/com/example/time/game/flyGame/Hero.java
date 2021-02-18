package com.example.time.game.flyGame;

import java.awt.image.BufferedImage;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/31 0031 16:06
 */
public class Hero extends FlyingObject{

    private int doubleFire; //火力值
    private int life; //命
    private BufferedImage[] images; //可切换的图片数组
    private int index; //协助图片切换
    /** 构造方法 */
    public Hero(){
        image = ShootGame.hero0; //图片
        width = image.getWidth();   //宽
        height = image.getHeight(); //高
        x = 150; //x:固定的值
        y = 400; //y:固定的值
        doubleFire = 10000; //默认为0(单倍火力)
        life = 3; //默认3条命
        images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1}; //两张图片切换
        index = 0; //协助图片切换
    }

}
