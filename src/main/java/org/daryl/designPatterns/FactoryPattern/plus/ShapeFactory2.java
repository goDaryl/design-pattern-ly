package org.daryl.designPatterns.FactoryPattern.plus;

/**
 * @author by ly
 * @create 2018/8/28 18:24
 */
public class ShapeFactory2 {
    public static <T> T getClass(Class<? extends T> clazz) {
        if (clazz == null) {
            return null;
        }

        T obj = null;
        try {
//            obj = clazz.getDeclaredConstructor().newInstance();  // java9 jdk9中直接使用泛型的newInstance方法已经过时。重写的getClass()
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
        }

        return obj;
    }
}
