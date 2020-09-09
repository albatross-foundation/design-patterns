package com.design.pattern.example5;

// CONCRETE creator
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
