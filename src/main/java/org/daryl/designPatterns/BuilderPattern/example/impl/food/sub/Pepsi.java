package org.daryl.designPatterns.BuilderPattern.example.impl.food.sub;

import org.daryl.designPatterns.BuilderPattern.example.impl.food.ColdDrink;

/**
 * @author by ly
 * @create 2018/9/18 10:11
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
