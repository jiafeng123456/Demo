package com.example.time.game.flyGame;

import java.util.Random;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/31 0031 16:07
 */
public class Bee extends FlyingObject implements Award {
    private int xSpeed = 1; //x坐标移动速度
    private int ySpeed = 2; //y坐标移动速度
    private int awardType;  //奖励的类型(0或1)
    /** 构造方法 */
    public Bee(){
        image = ShootGame.bee; //图片
        width = image.getWidth();   //宽
        height = image.getHeight(); //高
        Random rand = new Random(); //随机数对象
        x = rand.nextInt(ShootGame.WIDTH-this.width); //x:0到(窗口宽-小蜜蜂宽)之间的随机数
        y = -this.height; //y:负的小蜜蜂的高
        awardType = rand.nextInt(2); //0和1之间的随机数
    }

    /** 获取奖励类型 */
    public int getType(){
        return awardType; //返回奖励类型
    }

}
