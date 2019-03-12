package com.potulad.learning.designpatterns.factory.ingredient.dough;

/**
 * Chicago Style thick crust dough
 */
public class ChicagoDough extends Dough {

    private static final String CHICAGO_DOUGH = "Chicago Style Thick Crust Dough";

    @Override
    public String getIngredientDescription() {
        return CHICAGO_DOUGH;
    }
}
