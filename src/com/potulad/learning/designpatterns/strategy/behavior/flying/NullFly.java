package com.potulad.learning.designpatterns.strategy.behavior.flying;

public class NullFly implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
