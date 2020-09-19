package com.design.pattern.example5;

public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton doubleCheckedLockingSingleton;

    private DoubleCheckedLockingSingleton() {

    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (doubleCheckedLockingSingleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (doubleCheckedLockingSingleton == null) {
                    doubleCheckedLockingSingleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return doubleCheckedLockingSingleton;
    }
}
