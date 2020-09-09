package com.design.pattern.example5;

// CONCRETE creator
public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
