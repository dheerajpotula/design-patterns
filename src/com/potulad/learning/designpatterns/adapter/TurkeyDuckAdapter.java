package com.potulad.learning.designpatterns.adapter;

import lombok.AllArgsConstructor;

/**
 * An adapter that adapts a turkey to a duck
 */
@AllArgsConstructor
public class TurkeyDuckAdapter implements DuckInterface {

    /**
     * Compose the adapter with a turkey
     */
    private final Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void display() {
        turkey.display();
    }
}
