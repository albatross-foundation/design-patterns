package com.design.pattern.example2;

public class MenuTest {
    public static void main(String[] arg) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeMenu, dinerMenu);
        waitress.printMenu();
    }
}
