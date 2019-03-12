package com.potulad.learning.designpatterns.factory.ingredient.sauce;

/**
 * NY Style Marinara Sauce
 */
public class NYSauce extends Sauce {

    private static final String NY_SAUCE = "Marinara Sauce";

    @Override
    public String getIngredientDescription() {
        return NY_SAUCE;
    }
}
