package com.design.pattern.example1;

public class Coffee {

    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping coffee though filter");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }
}
