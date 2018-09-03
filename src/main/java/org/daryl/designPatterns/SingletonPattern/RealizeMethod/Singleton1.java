package org.daryl.designPatterns.SingletonPattern.RealizeMethod;

/**
 * @author by ly
 * @create 2018/8/31 10:38
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
