package com.emramirez.restaurantfusion.menu;

import com.emramirez.restaurantfusion.model.MenuItem;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
