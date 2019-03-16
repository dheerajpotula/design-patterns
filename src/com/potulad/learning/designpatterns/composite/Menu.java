package com.potulad.learning.designpatterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class to hold a menu. Each menu can hold menuItems and other sub-menus.
 */
@AllArgsConstructor
public class Menu extends MenuComponent{

    /**
     * Name of this menu
     */
    @Getter
    private final String name;

    /**
     * All the MenuComponents in this menu
     */
    private final List<MenuComponent> menuComponents = new ArrayList<>();

    /**
     * Add a new MenuComponent to this Menu.
     */
    @Override
    public void addMenuComponent(@NonNull MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    /**
     * Print the name of this menu and all items in this menu.
     */
    @Override
    public void print() {
        System.out.println("Items in Menu (" + name + ") : ");
        for(MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    /**
     * Get the iterator for this menu. We want to iterate over the sub menus in this menu so
     * using a CompositeIterator instead of relying on the regular iterator.
     */
    @Override
    public Iterator<MenuComponent> getIterator() {
        return new CompositeIterator(this.menuComponents.iterator());
    }
}
