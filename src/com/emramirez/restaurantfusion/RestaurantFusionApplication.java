package com.emramirez.restaurantfusion;

import com.emramirez.restaurantfusion.menu.DinerMenu;
import com.emramirez.restaurantfusion.menu.PancakeHouseMenu;
import com.emramirez.restaurantfusion.menu.Waitress;

public class RestaurantFusionApplication {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
