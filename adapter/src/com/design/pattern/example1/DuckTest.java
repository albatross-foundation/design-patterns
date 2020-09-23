package com.design.pattern.example1;

public class DuckTest {
    public static void main(String[] arg){
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("Turkey say...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("Duck say...");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("TurkeyAdapter say");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
