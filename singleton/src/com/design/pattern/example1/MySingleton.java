package com.design.pattern.example1;

public class MySingleton {
    private static MySingleton mySingleton;

    private MySingleton() {

    }

    public static MySingleton getInstance() {
        if (mySingleton == null) {
            mySingleton = new MySingleton(); // Khi nào dùng thì mới khởi tạo, kiểu này gọi là kiểu lazy
        }
        return mySingleton;
    }
}
