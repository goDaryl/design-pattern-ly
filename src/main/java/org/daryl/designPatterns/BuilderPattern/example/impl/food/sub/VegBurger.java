package org.daryl.designPatterns.BuilderPattern.example.impl.food.sub;

import org.daryl.designPatterns.BuilderPattern.example.impl.food.Burger;

/**
 * @author by ly
 * @create 2018/9/18 10:04
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
