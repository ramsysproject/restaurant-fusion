package com.emramirez.restaurantfusion.menu;

import com.emramirez.restaurantfusion.model.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B Pancake Breakfast", "Pancakes with scrambled eggs and toast",
                true, 2.99);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",
                true, 2.99);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
                true, 3.49);

        addItem("Waffles", "Waffles with your choice of blueberries or strawberries",
                true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
