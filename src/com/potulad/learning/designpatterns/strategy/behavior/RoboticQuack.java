package com.potulad.learning.designpatterns.strategy.behavior;

public class RoboticQuack implements QuackingBehavior {

    @Override
    public void quack() {
        System.out.println("Robotic Quack Quack!");
    }
}
