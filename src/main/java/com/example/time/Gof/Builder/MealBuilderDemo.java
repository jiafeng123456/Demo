package com.example.time.Gof.Builder;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/26 0026 15:45
 */
public class MealBuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.vegMeal();
        System.out.println(vegMeal.getCost());
        Meal beefMeal = mealBuilder.BeefMeal();
        System.out.println(beefMeal.getCost());
    }
}
