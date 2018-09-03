package org.daryl.designPatterns.FactoryPattern.example;

/**
 * @author by ly
 * @create 2018/8/28 19:13
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw() method.");
    }
}
