package com.emramirez.restaurantfusion.menu;

import com.emramirez.restaurantfusion.model.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
}
