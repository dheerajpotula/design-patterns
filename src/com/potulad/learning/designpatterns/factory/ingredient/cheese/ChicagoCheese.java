package com.potulad.learning.designpatterns.factory.ingredient.cheese;

/**
 * Chicago Style Pepper Jack cheese (since I can't think of another type of cheese that is used on Pizzas)
 */
public class ChicagoCheese extends Cheese {

    private static final String CHICAGO_CHEESE = "Chicago Style Pepper Jack Cheese";

    @Override
    public String getIngredientDescription() {
        return CHICAGO_CHEESE;
    }
}




