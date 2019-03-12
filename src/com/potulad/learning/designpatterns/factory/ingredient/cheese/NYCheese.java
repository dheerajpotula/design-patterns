package com.potulad.learning.designpatterns.factory.ingredient.cheese;

/**
 * NY Style Mozzarella cheese (assuming that's what folks at NY eat)
 */
public class NYCheese extends Cheese {

    private static final String NY_CHEESE = "NY Style Mozzarella Cheese";

    @Override
    public String getIngredientDescription() {
        return NY_CHEESE;
    }
}
