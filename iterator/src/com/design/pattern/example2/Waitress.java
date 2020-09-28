package com.design.pattern.example2;

public class Waitress {
    private Menu pancakeMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeMenu, Menu dinerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeMenuIterator = pancakeMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("MENU -- BREAKFAST");
        printMenu(pancakeMenuIterator);

        System.out.println("MENU -- DINNER");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if (menuItem != null) {
                System.out.print(menuItem.getName() + " ");
                System.out.print(menuItem.getPrice() + " -- ");
                System.out.println(menuItem.getDescription());
            }
        }
    }
}
