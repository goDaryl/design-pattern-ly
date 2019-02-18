package org.daryl.designPatterns.BuilderPattern.example.impl.food;

import org.daryl.designPatterns.BuilderPattern.example.impl.pack.Wrapper;
import org.daryl.designPatterns.BuilderPattern.example.intf.Item;
import org.daryl.designPatterns.BuilderPattern.example.intf.Packing;

/**
 * @author by ly
 * @create 2018/9/18 9:59
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
