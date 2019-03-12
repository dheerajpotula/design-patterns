package com.potulad.learning.designpatterns.strategy.duck;

import com.potulad.learning.designpatterns.strategy.behavior.flying.FlyingBehavior;
import com.potulad.learning.designpatterns.strategy.behavior.quacking.QuackingBehavior;
import lombok.AllArgsConstructor;

/**
 * Abstract class that encapsulates the flying behavior and quacking behavior of a duck.
 */
@AllArgsConstructor
public abstract class AbstractDuck {

    /**
     * Flying Behavior of AbstractDuck
     */
    private FlyingBehavior flyingBehavior;

    /**
     * Quacking Behavior of AbstractDuck
     */
    private QuackingBehavior quackingBehavior;

    public void quack() {
        quackingBehavior.quack();
    }

    public void fly() {
        flyingBehavior.fly();
    }

    abstract public void display();
}
