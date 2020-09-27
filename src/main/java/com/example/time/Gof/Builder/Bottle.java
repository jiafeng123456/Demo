package com.example.time.Gof.Builder;

import com.example.time.Gof.Builder.impl.Packing;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:20
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
