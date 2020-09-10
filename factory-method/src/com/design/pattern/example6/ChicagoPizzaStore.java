package com.design.pattern.example6;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals(PizzaType.CHEESE.toString())) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals(PizzaType.CLAM.toString())) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals(PizzaType.PEPPERONI.toString())) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals(PizzaType.VEGGIE.toString())) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
