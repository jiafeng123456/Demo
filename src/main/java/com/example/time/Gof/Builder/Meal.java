package com.example.time.Gof.Builder;

import com.example.time.Gof.Builder.impl.Item;

import java.util.ArrayList;
import java.util.List;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:36
 */
public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public float getCost(){
        float cost = 0f;
        for (Item item : itemList){
            cost += item.price();
            System.out.println("Item:"+item.name()+",Packing:"+item.packing().pack()+",price:"+item.price());
        }
        return cost;
    }
}
