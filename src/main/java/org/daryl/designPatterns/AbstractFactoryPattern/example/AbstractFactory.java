package org.daryl.designPatterns.AbstractFactoryPattern.example;


import org.daryl.designPatterns.FactoryPattern.example.Shape;

/**
 * @author by ly
 * @create 2018/8/31 9:12
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
