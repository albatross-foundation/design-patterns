package com.design.pattern.example1.product;

import com.design.pattern.example1.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
