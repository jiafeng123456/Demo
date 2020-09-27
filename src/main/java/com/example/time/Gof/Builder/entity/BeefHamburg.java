package com.example.time.Gof.Builder.entity;

import com.example.time.Gof.Builder.Hamburg;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:28
 */
public class BeefHamburg extends Hamburg {
    @Override
    public String name() {
        return "BeefHamburg";
    }

    @Override
    public float price() {
        return 50f;
    }
}
