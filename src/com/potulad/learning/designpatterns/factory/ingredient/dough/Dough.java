package com.potulad.learning.designpatterns.factory.ingredient.dough;

import com.potulad.learning.designpatterns.factory.ingredient.PizzaIngredient;

/**
 * Abstract class for all types of Pizza doughs
 */
public abstract class Dough implements PizzaIngredient {

    private static final String DOUGH_NAME = "Generic Pizza Dough";

    @Override
    public String getIngredientDescription() {
        return DOUGH_NAME;
    }
}
