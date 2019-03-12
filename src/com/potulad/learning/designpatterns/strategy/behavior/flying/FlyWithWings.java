package com.potulad.learning.designpatterns.strategy.behavior.flying;

public class FlyWithWings implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with wings!");
    }
}
