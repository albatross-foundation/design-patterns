package com.design.pattern.example3;

public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pouringInCup();
        if (customerWantAddCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pouringInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantAddCondiments() {
        return true;
    }
}
