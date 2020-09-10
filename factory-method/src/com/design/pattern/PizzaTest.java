package com.design.pattern;

import com.design.pattern.example6.*;

public class PizzaTest {
    public static void main(String[] arg){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE.toString());
        System.out.println("Manh order a " + pizza.getName());

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE.toString());
        System.out.println("Van order a " + pizza.getName());
    }
}
