package com.potulad.learning.designpatterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Iterator;

/**
 * Menu Item class for description individual items on Menu.
 */
@AllArgsConstructor
@Getter
public class MenuItem extends MenuComponent {

    /**
     * Name of the menu item
     */
    private final String name;

    /**
     * Description of the menu item.
     */
    private final String description;

    /**
     * Price of the menu item
     */
    private final double price;

    /**
     * Boolean to specify if this item contains meat
     */
    private final boolean vegetarian;

    @Override
    public void print() {
        System.out.println("Item : ");
        System.out.println("-------------------------");
        System.out.println(name);
        System.out.println(description);
        System.out.println(price);
        System.out.println(vegetarian ? "Veg" : "Non-Veg");
        System.out.println("-------------------------");
    }

    @Override
    public Iterator<MenuComponent> getIterator() {
        return new NullIterator();
    }
}
