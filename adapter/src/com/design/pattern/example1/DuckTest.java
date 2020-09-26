package com.design.pattern.example1;

public class DuckTest {
    public static void main(String[] arg){
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("Turkey say...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("TurkeyAdapter convert turkey to duck say ...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
