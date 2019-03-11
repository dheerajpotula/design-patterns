package com.potulad.learning.designpatterns.strategy.behavior;

public class FlyWithWings implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with wings!");
    }
}
