package com.design.pattern.example1;

public abstract class Beverage {
    protected String description = "Unknown Beverage";
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    protected int size;

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract double cost();
}
