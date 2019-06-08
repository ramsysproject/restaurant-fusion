package com.emramirez.restaurantfusion.menu;

import com.emramirez.restaurantfusion.model.MenuItem;

import java.util.HashMap;
import java.util.Iterator;

/**
 * A new brand was bought, CafeMenu
 */
public class CafeMenu implements Menu {
    private HashMap<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole whean bun, lettuce, tomato and fries",
                true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa and guacamole",
                true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
