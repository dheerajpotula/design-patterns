package com.potulad.learning.designpatterns.decorator.beverage;

/**
 * Dark Roast Beverage
 */
public class DarkRoast extends Beverage {

    private static final double cost = 7.1;

    private static final String description = "Dark Roast";

    public DarkRoast() {
        super(cost, description);
    }
}
