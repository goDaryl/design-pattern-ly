package org.daryl.designPatterns.BuilderPattern.example.impl.food.sub;

import org.daryl.designPatterns.BuilderPattern.example.impl.food.ColdDrink;

/**
 * @author by ly
 * @create 2018/9/18 10:11
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
