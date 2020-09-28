package com.design.pattern.example3;

import java.util.Arrays;
import java.util.List;

public class Example3Test {
    public static void main(String[] arg) {
        Menu dinerMenu = new DinerMenu();
        Menu pancakeMenu = new PancakeMenu();
        List<Menu> menus = Arrays.asList(dinerMenu, pancakeMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
