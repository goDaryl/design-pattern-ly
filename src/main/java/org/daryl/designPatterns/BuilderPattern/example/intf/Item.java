package org.daryl.designPatterns.BuilderPattern.example.intf;

/**
 * @author by ly
 * @create 2018/9/18 9:53
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
