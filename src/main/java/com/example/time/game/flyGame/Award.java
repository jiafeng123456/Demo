package com.example.time.game.flyGame;

/*
 *@description:
 *@author jiafeng
 *@date 2020/12/31 0031 16:08
 */
public interface Award {
    public int DOUBLE_FIRE = 0; //火力值
    public int LIFE = 1; //命
    /** 获取奖励类型(上面的0或1) */
    public int getType();
}
