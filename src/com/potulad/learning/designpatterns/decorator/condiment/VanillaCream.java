package com.potulad.learning.designpatterns.decorator.condiment;

import com.potulad.learning.designpatterns.decorator.beverage.Beverage;
import lombok.NonNull;

public class VanillaCream extends CondimentDecorator {

    private static final double cost = 1.32;

    private static final String description = "Vanilla Cream";

    public VanillaCream(@NonNull Beverage beverage) {
        super(beverage, cost, description);
    }
}
