package org.daryl.designPatterns.FactoryPattern.plus2;

/**
 * @author by ly
 * @create 2018/8/28 19:23
 */
public class FactoryPatternDemo3 {
    public static void main(String[] args) {
        ShapeFactory3.getShape("circle").draw();
        ShapeFactory3.getShape("rectangle").draw();
        ShapeFactory3.getShape("square").draw();
    }

}
