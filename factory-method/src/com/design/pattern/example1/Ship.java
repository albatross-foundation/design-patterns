package com.design.pattern.example1;

public class Ship implements Transport {
    @Override
    public String deliver() {
        return "Ship: Deliver by sea in a container.";
    }
}
