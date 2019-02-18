package org.daryl.designPatterns.BuilderPattern.example.impl.pack;

import org.daryl.designPatterns.BuilderPattern.example.intf.Packing;

/**
 * @author by ly
 * @create 2018/9/18 9:58
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
