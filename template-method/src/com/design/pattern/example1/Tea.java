package com.design.pattern.example1;

public class Tea {

    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding lemon");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
