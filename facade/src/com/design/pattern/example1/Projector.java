package com.design.pattern.example1;

public class Projector {
    private String description;

    public Projector(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void wideScreenMode() {
        System.out.println(description + " in wide screen mode");
    }

    public void tvMode() {
        System.out.println(description + " int tv mode");
    }

    @Override
    public String toString() {
        return description;
    }
}
