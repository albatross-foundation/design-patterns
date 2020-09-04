package com.design.pattern.example3;

public class BikeWheel extends Wheel {

    private float diameter;
    private float width;

    public BikeWheel(float diameter, float width) {
        this.diameter = diameter;
        this.width = width;
    }

    @Override
    public float getDiameter() {
        return this.diameter;
    }

    @Override
    public float getWidth() {
        return this.width;
    }
}
