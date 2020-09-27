package com.example.time.Gof.Builder;

import com.example.time.Gof.Builder.entity.BeefHamburg;
import com.example.time.Gof.Builder.entity.Coke;
import com.example.time.Gof.Builder.entity.Pepsi;
import com.example.time.Gof.Builder.entity.VegHamburg;
import com.sun.org.apache.bcel.internal.classfile.Node;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:41
 */
public class MealBuilder {
    public Meal vegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegHamburg());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal BeefMeal(){
        Meal meal = new Meal();
        meal.addItem(new BeefHamburg());
        meal.addItem(new Pepsi());
        return meal;
    }
}
