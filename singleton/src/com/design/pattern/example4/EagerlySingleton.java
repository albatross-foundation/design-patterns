package com.design.pattern.example4;

public class EagerlySingleton {
    private static EagerlySingleton eagerlySingleton = new EagerlySingleton();

    private EagerlySingleton() {

    }

    public static EagerlySingleton getInstance() {
        return eagerlySingleton;
    }
}
