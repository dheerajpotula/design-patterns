package com.potulad.learning.designpatterns.decorator.beverage;

/**
 * Mocha Beverage
 */
public class Mocha extends Beverage {

    private static final double cost = 3.8;

    private static final String description = "Mocha";

    public Mocha() {
        super(cost, description);
    }
}
