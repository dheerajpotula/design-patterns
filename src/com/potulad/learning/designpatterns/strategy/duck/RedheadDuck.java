package com.potulad.learning.designpatterns.strategy.duck;

import com.potulad.learning.designpatterns.strategy.behavior.flying.FlyingBehavior;
import com.potulad.learning.designpatterns.strategy.behavior.quacking.QuackingBehavior;

public class RedheadDuck extends AbstractDuck {

    public RedheadDuck(FlyingBehavior flyingBehavior, QuackingBehavior quackingBehavior) {
        super(flyingBehavior, quackingBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck!");
    }
}
