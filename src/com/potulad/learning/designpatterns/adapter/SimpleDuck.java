package com.potulad.learning.designpatterns.adapter;

/**
 * A simple duck that flies and quacks.
 */
public class SimpleDuck implements DuckInterface {

    @Override
    public void quack() {
        System.out.println("Quack Quack Quack!");
    }

    @Override
    public void fly() {
        System.out.println("Flying for 10 meters");
    }

    @Override
    public void display() {
        System.out.println("I am simple, regular duck!");
    }
}
