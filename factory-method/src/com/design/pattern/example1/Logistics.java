package com.design.pattern.example1;

public abstract class Logistics {

    public abstract Transport createTransport(String transportType);

    public String planDelivery(String transportType) {
        Transport t = createTransport(transportType);
        return t.deliver();
    }
}
