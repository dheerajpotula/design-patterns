package com.potulad.learning.designpatterns.composite;

import java.util.Iterator;

/**
 * Null Iterator that is just a null object and doesn't iterate over anything
 */
public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
