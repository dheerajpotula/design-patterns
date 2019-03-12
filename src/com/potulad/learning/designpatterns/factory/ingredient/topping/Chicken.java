package com.potulad.learning.designpatterns.factory.ingredient.topping;

import com.potulad.learning.designpatterns.factory.ingredient.PizzaIngredient;

/**
 * Chicken Topping on Pizza
 */
public class Chicken implements PizzaIngredient {

    private static final String CHICKEN_TOPPING = "Chicken Topping";

    @Override
    public String getIngredientDescription() {
        return CHICKEN_TOPPING;
    }
}
