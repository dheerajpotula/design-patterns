package com.potulad.learning.designpatterns.factory.ingredient.cheese;

import com.potulad.learning.designpatterns.factory.ingredient.PizzaIngredient;

/**
 * Abstract class for all types of Pizza cheese
 */
public abstract class Cheese implements PizzaIngredient {

    private static final String CHEESE_NAME = "Generic Pizza Cheese";

    @Override
    public String getIngredientDescription() {
        return CHEESE_NAME;
    }
}
