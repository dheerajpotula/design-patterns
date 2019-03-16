package com.potulad.learning.designpatterns.composite;


import lombok.NonNull;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * A composite iterator that returns the next element in the entire composite tree (which contains
 * both menuItems and menus).
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    /**
     * Stack to store the iterators encountered so far.
     */
    private final Stack<Iterator<MenuComponent>> iteratorStack = new Stack<>();

    public CompositeIterator(@NonNull Iterator<MenuComponent> initialIterator) {
        this.iteratorStack.push(initialIterator);
    }

    @Override
    public boolean hasNext() {
        while(!iteratorStack.isEmpty()) {
            Iterator<MenuComponent> topIterator = iteratorStack.peek();
            if(topIterator.hasNext()) {
                return true;
            }
            iteratorStack.pop();
        }
        return false;
    }

    @Override
    public MenuComponent next() {
        if(hasNext()) {
            Iterator<MenuComponent> menuComponentIterator = iteratorStack.peek();

            if(menuComponentIterator.hasNext()) {
                MenuComponent nextMenuComponent = menuComponentIterator.next();
                iteratorStack.push(nextMenuComponent.getIterator());
                return nextMenuComponent;
            } else {
                iteratorStack.pop();
            }
        }
        throw new NoSuchElementException("No more elements in the iterator");
    }
}
