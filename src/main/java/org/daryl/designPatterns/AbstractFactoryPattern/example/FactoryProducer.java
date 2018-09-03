package org.daryl.designPatterns.AbstractFactoryPattern.example;

/**
 * @author by ly
 * @create 2018/8/31 9:44
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
