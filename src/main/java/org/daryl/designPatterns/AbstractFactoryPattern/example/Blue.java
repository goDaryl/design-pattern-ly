package org.daryl.designPatterns.AbstractFactoryPattern.example;

/**
 * @author by ly
 * @create 2018/8/31 9:11
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
