package com.potulad.learning.designpatterns.factory.ingredient.topping;

import com.potulad.learning.designpatterns.factory.ingredient.PizzaIngredient;

/**
 * Pepperoni Topping
 */
public class Pepperoni implements PizzaIngredient {

    private static final String PEPPERONI_TOPPING = "Pepperoni Topping";

    @Override
    public String getIngredientDescription() {
        return PEPPERONI_TOPPING;
    }
}
