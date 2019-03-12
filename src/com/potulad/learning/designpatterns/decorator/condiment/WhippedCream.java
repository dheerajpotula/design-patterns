package com.potulad.learning.designpatterns.decorator.condiment;

import com.potulad.learning.designpatterns.decorator.beverage.Beverage;
import lombok.NonNull;

public class WhippedCream extends CondimentDecorator {

    private static final double cost = 1.08;

    private static final String description = "Whipped Cream";

    public WhippedCream(@NonNull Beverage beverage) {
        super(beverage, cost, description);
    }
}
