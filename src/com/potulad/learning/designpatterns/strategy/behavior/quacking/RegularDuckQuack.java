package com.potulad.learning.designpatterns.strategy.behavior.quacking;

public class RegularDuckQuack implements QuackingBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Quack Quack!");
    }
}
