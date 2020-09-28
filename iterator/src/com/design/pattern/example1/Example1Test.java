package com.design.pattern.example1;

import java.util.List;

public class Example1Test {
    public static void main(String[] arg) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        List<MenuItem> breakfastMenu = pancakeMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] dinerMenus = dinerMenu.getMenuItems();

        for (int i = 0; i < breakfastMenu.size(); i++) {
            MenuItem menuItem = breakfastMenu.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

        for (int i = 0; i < dinerMenus.length; i++) {
            MenuItem menuItem = dinerMenus[i];
            if (menuItem != null) {
                System.out.print(menuItem.getName() + " ");
                System.out.println(menuItem.getPrice() + " ");
                System.out.println(menuItem.getDescription());
            }
        }
    }
}
