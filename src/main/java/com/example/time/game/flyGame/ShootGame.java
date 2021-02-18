package com.example.time.game.flyGame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/31 0031 16:05
 */
public class ShootGame extends JPanel {
    public static final int WIDTH = 400;  //窗口宽
    public static final int HEIGHT = 654; //窗口高

    public static BufferedImage background; //背景图
    public static BufferedImage start;   	//启动图
    public static BufferedImage pause;		//暂停图
    public static BufferedImage gameover;	//游戏结束图
    public static BufferedImage airplane;	//敌机
    public static BufferedImage bee;		//小蜜蜂
    public static BufferedImage bullet;		//子弹
    public static BufferedImage hero0;		//英雄机0
    public static BufferedImage hero1;		//英雄机1
    static{ //初始化静态图片
        try{
            background = ImageIO.read(ShootGame.class.getResource("background.png"));
            start = ImageIO.read(ShootGame.class.getResource("start.png"));
            pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
            gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
            airplane = ImageIO.read(ShootGame.class.getResource("airplane.png"));
            bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
            bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
            hero0 = ImageIO.read(ShootGame.class.getResource("hero0.png"));
            hero1 = ImageIO.read(ShootGame.class.getResource("hero1.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private Hero hero = new Hero(); //一个英雄机
    private FlyingObject[] flyings = {}; //一堆敌人(敌机+小蜜蜂)
    private Bullet[] bullets = {}; //一堆子弹

    public static final int START = 0;     //启动状态
    public static final int RUNNING = 1;   //运行状态
    public static final int PAUSE = 2;     //暂停状态
    public static final int GAME_OVER = 3; //游戏结束状态
    private int state = START; //当前状态(默认启动状态)
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fly"); //创建窗口对象
        ShootGame game = new ShootGame(); //创建面板对象
        frame.add(game); //将面板添加到窗口中
        frame.setSize(WIDTH, HEIGHT); //设置窗口大小
        frame.setAlwaysOnTop(true); //设置总是在最上面
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口默认关闭操作(关闭窗口时退出程序)
        frame.setLocationRelativeTo(null); //设置居中显示
        frame.setVisible(true); //1)设置窗口可见  2)尽快调用paint()方法

//        game; //启动程序的执行
    }
    /** 重写paint() g:画笔*/
    public void paint(Graphics g){
        g.drawImage(background,0,0,null); //画背景图
        paintHero(g); //画英雄机对象
        paintFlyingObjects(g); //画敌人(敌机+小蜜蜂)对象
        paintBullets(g); //画子弹对象
//        paintScoreAndLife(g); //画分和画命
//        paintState(g); //画状态
    }
    /** 画英雄机对象 */
    public void paintHero(Graphics g){
        g.drawImage(hero.image,hero.x,hero.y,null); //画英雄机对象
    }
    /** 画敌人(敌机+小蜜蜂)对象 */
    public void paintFlyingObjects(Graphics g){
        for(int i=0;i<flyings.length;i++){ //遍历所有敌人(敌机+小蜜蜂)
            FlyingObject f = flyings[i]; //获取每一个敌人(敌机+小蜜蜂)
            g.drawImage(f.image,f.x,f.y,null); //画敌人(敌机+小蜜蜂)对象
        }
    }
    /** 画子弹对象 */
    public void paintBullets(Graphics g){
        for(int i=0;i<bullets.length;i++){ //遍历所有子弹
            Bullet b = bullets[i]; //获取每一个子弹
            g.drawImage(b.image,b.x,b.y,null); //画子弹对象
        }
    }

}
