package com.design.pattern.example3;

public class WheelFactory {
    public static Wheel getWheel(String type, float diameter, float width) {
        if ("CarWheel".equalsIgnoreCase(type)) {
            return new CarWheel(diameter, width);
        }
        if ("BikeWeel".equalsIgnoreCase(type)) {
            return new BikeWheel(diameter, width);
        }
        return null;
    }
}
