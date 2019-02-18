package org.daryl.designPatterns.BuilderPattern.example.impl.food.sub;

import org.daryl.designPatterns.BuilderPattern.example.impl.food.Burger;

/**
 * @author by ly
 * @create 2018/9/18 10:05
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
