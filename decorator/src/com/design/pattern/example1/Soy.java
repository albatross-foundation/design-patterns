package com.design.pattern.example1;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (this.getSize() == Beverage.TALL) {
            cost += 0.10;
        } else if (this.getSize() == Beverage.GRANDE) {
            cost += 0.15;
        } else if (this.getSize() == Beverage.VENTI) {
            cost += 0.20;
        }
        return cost;
    }
}
