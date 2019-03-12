package com.potulad.learning.designpatterns.decorator.condiment;

import com.potulad.learning.designpatterns.decorator.beverage.Beverage;
import lombok.NonNull;

public class Cinnamon extends CondimentDecorator {

    private static final double cost = 0.51;

    private static final String description = "Cinnamon";

    public Cinnamon(@NonNull Beverage beverage) {
        super(beverage, cost, description);
    }
}
