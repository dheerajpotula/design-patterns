package com.potulad.learning.designpatterns.strategy.behavior;

public class NullFly implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
