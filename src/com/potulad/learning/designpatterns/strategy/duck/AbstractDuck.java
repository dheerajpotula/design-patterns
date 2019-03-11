package com.potulad.learning.designpatterns.strategy.duck;


import com.potulad.learning.designpatterns.strategy.behavior.FlyingBehavior;
import com.potulad.learning.designpatterns.strategy.behavior.QuackingBehavior;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AbstractDuck {

    private FlyingBehavior flyingBehavior;

    private QuackingBehavior quackingBehavior;

    public void quack() {
        quackingBehavior.quack();
    }

    public void fly() {
        flyingBehavior.fly();
    }

    abstract public void display();
}
