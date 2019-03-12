package com.potulad.learning.designpatterns.factory.ingredient.dough;

/**
 * NY style thin crust dough
 */
public class NYDough extends Dough {

    private static final String NY_DOUGH = "NY Style Thin Crust Dough";

    @Override
    public String getIngredientDescription() {
        return NY_DOUGH;
    }
}
