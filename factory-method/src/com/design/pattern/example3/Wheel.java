package com.design.pattern.example3;

public abstract class Wheel {
    public abstract float getDiameter();

    public abstract float getWidth();

    @Override
    public String toString() {
        return "Diameter = " + this.getDiameter() +
                "Width = " + this.getWidth();
    }
}
