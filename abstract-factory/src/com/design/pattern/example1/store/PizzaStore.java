package com.design.pattern.example1.store;

import com.design.pattern.example1.product.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
