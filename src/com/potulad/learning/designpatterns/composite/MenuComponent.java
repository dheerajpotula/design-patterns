package com.potulad.learning.designpatterns.composite;

import lombok.NonNull;

import java.util.Iterator;

/**
 * Menu Component that encapsulates both MenuItems and Menus (i.e. contains Individual Menu Items and Menus).
 */
public abstract class MenuComponent {

    public void addMenuComponent(@NonNull MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Operation is not supported!");
    }

    public String getName() {
        throw new UnsupportedOperationException("Operation is not supported!");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("Operation is not supported!");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("Operation is not supported!");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("Operation is not supported!");
    }

    public void print() {
        throw new UnsupportedOperationException("Operation is not supported!");
    }

    public Iterator<MenuComponent> getIterator() {
        throw new UnsupportedOperationException("Operation is not supported!");
    }
}
