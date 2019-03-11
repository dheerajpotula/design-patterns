package com.potulad.learning.designpatterns.strategy.behavior;

public class FlyWithRockets implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with rockets!");
    }
}
