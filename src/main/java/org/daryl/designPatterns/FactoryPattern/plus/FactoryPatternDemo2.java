package org.daryl.designPatterns.FactoryPattern.plus;


import org.daryl.designPatterns.FactoryPattern.example.*;

/**
 * @author by ly
 * @create 2018/8/28 19:23
 */
public class FactoryPatternDemo2 {
    public static void main(String[] args) {
        ShapeFactory2 shapeFactory2 = new ShapeFactory2();

        Rectangle rect = (Rectangle) shapeFactory2.getClass(Rectangle.class);
        rect.draw();

        Square square = (Square) shapeFactory2.getClass(Square.class);
        square.draw();

        Circle circle = (Circle) shapeFactory2.getClass(Circle.class);
        circle.draw();
    }

}
