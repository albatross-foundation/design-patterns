package com.design.pattern.example4;

public class PhoneFactory {
    public Phone getPhone(PhoneType type){
        Phone phone = null;
        switch (type){
            case APPLE: phone = new ApplePhone();
            break;
            case SAMSUNG: phone = new SamsungPhone();
            break;
        }
        return phone;
    }
}
