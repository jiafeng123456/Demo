package com.example.time.Gof.Builder.entity;

import com.example.time.Gof.Builder.ColdDrink;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:34
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 30f;
    }
}
