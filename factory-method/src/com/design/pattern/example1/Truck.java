package com.design.pattern.example1;

public class Truck implements Transport {
    @Override
    public String deliver() {
        return "Truck: Deliver by land in a box.";
    }
}
