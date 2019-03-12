package com.potulad.learning.designpatterns.decorator.condiment;

import com.potulad.learning.designpatterns.decorator.beverage.Beverage;
import lombok.NonNull;

/**
 * Abstract class for all condiment related decorators.
 */
public class CondimentDecorator extends Beverage {

    /**
     * Composing the decorator with the base class of {@link Beverage}
     */
    @NonNull
    private final Beverage beverage;

    /**
     * Cost of the condiment.
     */
    private final double cost;

    /**
     * Description of the condiment.
     */
    @NonNull
    private final String description;

    public CondimentDecorator(@NonNull Beverage beverage, double cost, @NonNull String description){
        super(beverage.getCost(), beverage.getDescription());
        this.beverage = beverage;
        this.cost = cost;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return this.description + ", " + this.beverage.getDescription();
    }

    @Override
    public double getCost() {
        return this.cost + this.beverage.getCost();
    }
}
