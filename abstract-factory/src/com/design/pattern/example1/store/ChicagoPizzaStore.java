package com.design.pattern.example1.store;

import com.design.pattern.example1.factory.ChicagoPizzaIngredientFactory;
import com.design.pattern.example1.factory.PizzaIngredientFactory;
import com.design.pattern.example1.product.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals(PizzaType.CHEESE.toString())) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals(PizzaType.VEGGIE.toString())) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (type.equals(PizzaType.CLAM.toString())) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (type.equals(PizzaType.PEPPERONI.toString())) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
