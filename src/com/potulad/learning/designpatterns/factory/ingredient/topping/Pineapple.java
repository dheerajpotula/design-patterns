package com.potulad.learning.designpatterns.factory.ingredient.topping;

import com.potulad.learning.designpatterns.factory.ingredient.PizzaIngredient;

/**
 * Pineapple topping on Pizza;
 */
public class Pineapple implements PizzaIngredient {

    private static final String PINEAPPLE_TOPPING = "Pineapple Topping";

    @Override
    public String getIngredientDescription() {
        return PINEAPPLE_TOPPING;
    }
}
