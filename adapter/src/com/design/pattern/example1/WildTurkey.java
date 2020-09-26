package com.design.pattern.example1;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble from WildTurkey class");
    }

    @Override
    public void fly() {
        System.out.println("Fly from WildTurkey class");
    }
}
