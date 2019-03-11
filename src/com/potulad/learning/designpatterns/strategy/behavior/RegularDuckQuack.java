package com.potulad.learning.designpatterns.strategy.behavior;

public class RegularDuckQuack implements QuackingBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Quack Quack!");
    }
}
