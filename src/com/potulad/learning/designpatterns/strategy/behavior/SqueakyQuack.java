package com.potulad.learning.designpatterns.strategy.behavior;

public class SqueakyQuack implements QuackingBehavior {

    @Override
    public void quack() {
        System.out.println("Squeaky Quack Quack!");
    }
}
