package com.design.pattern.example1;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport(String transportType) {
        if ("Ship".equalsIgnoreCase(transportType)) {
            return new Ship();
        }
        return null;
    }
}
