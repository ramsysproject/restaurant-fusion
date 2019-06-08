package com.emramirez.restaurantfusion.menu;

import com.emramirez.restaurantfusion.model.MenuItem;

public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
