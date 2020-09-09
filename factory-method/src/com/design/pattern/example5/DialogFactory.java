package com.design.pattern.example5;

public class DialogFactory {
    public static Dialog getDialog(String type) throws Exception {
        if ("Windows".equalsIgnoreCase(type)) {
            return new WindowsDialog();
        } else if ("Web".equalsIgnoreCase(type)) {
            return new WebDialog();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
    }
}
