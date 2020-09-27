package com.design.pattern.example3;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public boolean customerWantAddCondiments() {
        return super.customerWantAddCondiments();
    }
}
