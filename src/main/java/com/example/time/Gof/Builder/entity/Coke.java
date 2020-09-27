package com.example.time.Gof.Builder.entity;

import com.example.time.Gof.Builder.ColdDrink;
import com.example.time.Gof.Builder.impl.Item;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:33
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 20f;
    }
}
