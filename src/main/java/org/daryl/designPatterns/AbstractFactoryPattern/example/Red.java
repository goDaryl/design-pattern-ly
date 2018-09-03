package org.daryl.designPatterns.AbstractFactoryPattern.example;

/**
 * @author by ly
 * @create 2018/8/31 9:10
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
