package com.design.pattern.example1.store;

import com.design.pattern.example1.factory.NYPizzaIngredientFactory;
import com.design.pattern.example1.factory.PizzaIngredientFactory;
import com.design.pattern.example1.product.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals(PizzaType.CHEESE.toString())) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals(PizzaType.VEGGIE.toString())) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (type.equals(PizzaType.CLAM.toString())) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals(PizzaType.PEPPERONI.toString())) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
