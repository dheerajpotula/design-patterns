package com.potulad.learning.designpatterns.factory.ingredient.sauce;

import com.potulad.learning.designpatterns.factory.ingredient.PizzaIngredient;

/**
 * Abstract class for all Pizza sauces
 */
public abstract class Sauce implements PizzaIngredient {

    private static final String SAUCE_NAME = "Generic Pizza Sauce";

    @Override
    public String getIngredientDescription() {
        return SAUCE_NAME;
    }
}
