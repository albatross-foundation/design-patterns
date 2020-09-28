package com.design.pattern.example1;

import java.util.ArrayList;

public class PancakeMenu {
    private ArrayList<MenuItem> menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B pancake breakfast", "Pancake with scrambled eggs and toast", true, 2.99);
        addItem("Regular pancake breakfast", "Pancake with fired eggs and sausage", true, 2.99);
        addItem("Blueberry pancake", "Pancake made with fresh blueberry", true, 3.99);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(description, name, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
