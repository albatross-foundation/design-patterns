package com.design.pattern.example6;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals(PizzaType.CHEESE.toString())) {
            return new NYStyleCheesePizza();
        } else if (type.equals(PizzaType.CLAM.toString())) {
            return new NYStyleClamPizza();
        } else if (type.equals(PizzaType.PEPPERONI.toString())) {
            return new NYStylePepperoniPizza();
        } else if (type.equals(PizzaType.VEGGIE.toString())) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
