package org.daryl.designPatterns.FactoryPattern.plus2;


import org.daryl.designPatterns.FactoryPattern.example.*;

/**
 * @author by ly
 * @create 2018/8/28 19:32
 */
public enum ShapeFactory3 {
    CIRCLE(new Circle(), "CIRCLE"),
    RECTANGLE(new Rectangle(), "RECTANGLE"),
    SQUARE(new Square(), "SQUARE");
    
    // 成员变量
    private Shape shape;
    private String name;

    // 普通方法
    public static Shape getShape(String name) {
        for (ShapeFactory3 c : ShapeFactory3.values()) {
            if (c.name.equalsIgnoreCase(name)){
                return c.shape;
            }
        }
        return null;
    }

    //构造方法
    ShapeFactory3(Shape shape, String name) {
        this.shape = shape;
        this.name = name;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
