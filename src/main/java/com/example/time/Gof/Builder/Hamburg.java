package com.example.time.Gof.Builder;

import com.example.time.Gof.Builder.impl.Item;
import com.example.time.Gof.Builder.impl.Packing;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:21
 */
public abstract class Hamburg implements Item {
    @Override
    public Packing packing() {
        return new Wapper();
    }
}
