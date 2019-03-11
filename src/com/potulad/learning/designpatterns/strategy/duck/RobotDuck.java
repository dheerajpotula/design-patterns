package com.potulad.learning.designpatterns.strategy.duck;

import com.potulad.learning.designpatterns.strategy.behavior.FlyingBehavior;
import com.potulad.learning.designpatterns.strategy.behavior.QuackingBehavior;

public class RobotDuck extends AbstractDuck {

    public RobotDuck(FlyingBehavior flyingBehavior, QuackingBehavior quackingBehavior) {
        super(flyingBehavior, quackingBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a Robot Duck!");
    }
}
