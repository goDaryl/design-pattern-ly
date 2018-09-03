package org.daryl.designPatterns.FactoryPattern.example;

/**
 * @author by ly
 * @create 2018/8/28 18:26
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw() method.");
    }
}
