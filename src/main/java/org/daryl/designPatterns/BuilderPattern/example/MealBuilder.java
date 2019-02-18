package org.daryl.designPatterns.BuilderPattern.example;

import org.daryl.designPatterns.BuilderPattern.example.impl.food.sub.ChickenBurger;
import org.daryl.designPatterns.BuilderPattern.example.impl.food.sub.Coke;
import org.daryl.designPatterns.BuilderPattern.example.impl.food.sub.Pepsi;
import org.daryl.designPatterns.BuilderPattern.example.impl.food.sub.VegBurger;

/**
 * @author by ly
 * @create 2018/9/18 10:18
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
