package com.potulad.learning.designpatterns.strategy.duck;

import com.potulad.learning.designpatterns.strategy.behavior.FlyingBehavior;
import com.potulad.learning.designpatterns.strategy.behavior.QuackingBehavior;

public class MallardDuck extends AbstractDuck {

    public MallardDuck(FlyingBehavior flyingBehavior, QuackingBehavior quackingBehavior) {
        super(flyingBehavior, quackingBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck!");
    }
}
