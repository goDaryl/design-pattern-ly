package org.daryl.designPatterns.FactoryPattern.plus3;


import org.daryl.designPatterns.FactoryPattern.example.*;

/**
 * @author by ly
 * @create 2018/8/28 19:50
 */
public class ShapeFactory4 {
    public static Shape getShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
