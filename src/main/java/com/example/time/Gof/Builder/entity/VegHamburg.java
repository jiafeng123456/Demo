package com.example.time.Gof.Builder.entity;

import com.example.time.Gof.Builder.Hamburg;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:28
 */
public class VegHamburg extends Hamburg {

    @Override
    public String name() {
        return "VegHamburg";
    }

    @Override
    public float price() {
        return 25f;
    }
}
