package org.daryl.designPatterns.FactoryPattern.example;

/**
 * @author by ly
 * @create 2018/8/28 19:14
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw() method.");
    }
}
