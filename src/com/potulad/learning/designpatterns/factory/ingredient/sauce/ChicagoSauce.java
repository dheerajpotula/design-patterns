package com.potulad.learning.designpatterns.factory.ingredient.sauce;

/**
 * Chicago Style Buffalo Sauce
 */
public class ChicagoSauce extends Sauce {

    private static final String CHICAGO_SAUCE = "Buffalo Sauce";

    @Override
    public String getIngredientDescription() {
        return CHICAGO_SAUCE;
    }
}
