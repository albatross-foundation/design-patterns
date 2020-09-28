package com.design.pattern.example2;

import java.util.List;

public class PancakeMenuIterator implements Iterator {

    private List<MenuItem> menuItems;
    private int position;

    public PancakeMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = menuItems.get(position);
        position = position + 1;
        return object;
    }
}
