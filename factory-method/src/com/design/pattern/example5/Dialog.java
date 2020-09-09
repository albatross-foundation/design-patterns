package com.design.pattern.example5;

// Base creator
public abstract class Dialog {
    public abstract Button createButton();

    public void render(){
        Button button = createButton();
        button.render();
    }
}