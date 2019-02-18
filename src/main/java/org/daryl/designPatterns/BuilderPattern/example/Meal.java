package org.daryl.designPatterns.BuilderPattern.example;

import org.daryl.designPatterns.BuilderPattern.example.intf.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by ly
 * @create 2018/9/18 10:14
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
