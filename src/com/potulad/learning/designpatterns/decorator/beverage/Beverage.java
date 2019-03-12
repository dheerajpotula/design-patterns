package com.potulad.learning.designpatterns.decorator.beverage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

/**
 * Abstract Class for Beverages.
 */
@Getter
@AllArgsConstructor
public abstract class Beverage {

    /**
     * Cost of the beverage.
     */
    private final double cost;

    /**
     * Description of the beverage.
     */
    @NonNull
    private final String description;
}
