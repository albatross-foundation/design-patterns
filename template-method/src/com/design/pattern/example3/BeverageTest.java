package com.design.pattern.example3;

public class BeverageTest {
    public static void main(String[] arg) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        TeaWithHook teaWithHook = new TeaWithHook();

        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
