package com.design.pattern.example3;

public class MenuItem {
    private String description;
    private String name;
    private boolean vegetarian;
    private double price;

    public MenuItem(String description, String name, boolean vegetarian, double price) {
        this.description = description;
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
