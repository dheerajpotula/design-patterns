package com.potulad.learning.designpatterns.decorator.beverage;

import lombok.NonNull;

public class HouseBlend extends Beverage {

    private static final double cost = 5.3;

    private static final String description = "House Blend";

    public HouseBlend() {
        super(cost, description);
    }
}
