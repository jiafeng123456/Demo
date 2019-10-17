package com.example.time.test;

import java.util.ArrayList;
import java.util.List;

/*
 *@description:
 *@author jiafeng
 *@date 2019/10/17 0017 11:30
 */
public class demo1 {

    public static void main(String[] args) {
        String[] typeList = new String[]{
                "下载登陆小翼管家APP",
                "下载登陆天翼云盘APP",
                "下载登陆天翼云盘PC端",
                "安装登陆天翼高清家庭云",
                "体验智能提速",
                "每日登录小翼管家APP",
                "每日登陆天翼云盘APP",
                "每日登陆天翼云盘PC端",
                "每日登陆天翼高清家庭云",
                "天翼云盘有上传行为",
                "发展小翼管家新增用户",
                "发展天翼云盘新增用户"
        };
        List<Integer>  i = new ArrayList<>();
        for (String type : typeList){
            i.add(getScoreByType(type));
        }
        System.out.println();
    }

    private static int getScoreByType(String type) {
        int score = 0;
        switch (type) {
            case "下载登陆小翼管家APP":
                return 5;
            case "下载登陆天翼云盘APP":
                return 5;
            case "下载登陆天翼云盘PC端":
                return 5;
            case "安装登陆天翼高清家庭云":
                return 5;
            case "体验智能提速":
                return 5;
            case "每日登录小翼管家APP":
                return 2;
            case "每日登陆天翼云盘APP":
                return 2;
            case "每日登陆天翼云盘PC端":
                return 2;
            case "每日登陆天翼高清家庭云":
                return 2;
            case "天翼云盘有上传行为":
                return 4;
            case "发展小翼管家新增用户":
                return 20;
            case "发展天翼云盘新增用户":
                return 20;

        }



        return score;
    }
}
