package org.daryl.designPatterns.BuilderPattern.example.impl.food;

import org.daryl.designPatterns.BuilderPattern.example.impl.pack.Bottle;
import org.daryl.designPatterns.BuilderPattern.example.intf.Item;
import org.daryl.designPatterns.BuilderPattern.example.intf.Packing;

/**
 * @author by ly
 * @create 2018/9/18 10:03
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
