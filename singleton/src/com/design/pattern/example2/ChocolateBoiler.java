package com.design.pattern.example2;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill() {
        if (getEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if (!getEmpty() && getBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if (!getEmpty() && ! getBoiled()){
            boiled = true;
        }
    }

    public boolean getEmpty() {
        return empty;
    }

    public boolean getBoiled() {
        return boiled;
    }
}
