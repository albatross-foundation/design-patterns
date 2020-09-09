package com.design.pattern.example1;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport(String transportType) {
        if ("Truck".equalsIgnoreCase(transportType)){
            return new Truck();
        }
        return null;
    }
}
