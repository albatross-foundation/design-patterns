package com.design.pattern.example1;

public class Tuner {
    private String description;
    private Double frequency;

    public Tuner(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setFrequency(Double frequency) {
        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public void setAM() {
        System.out.println(description + " setting AM mode");
    }

    public void setFM() {
        System.out.println(description + " setting FM mode");
    }

    @Override
    public String toString() {
        return description;
    }
}
