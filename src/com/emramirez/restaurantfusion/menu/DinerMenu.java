package com.emramirez.restaurantfusion.menu;

import com.emramirez.restaurantfusion.model.MenuItem;

public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Fakin Bacon with lettuce and tomato on whole meat",
                true, 2.99);

        addItem("BLT", "Bacon with lettuce and tomato on whole meat",
                false, 2.99);

        addItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.29);

        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can´t add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
