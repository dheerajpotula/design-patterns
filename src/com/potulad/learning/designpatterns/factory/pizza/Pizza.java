package com.potulad.learning.designpatterns.factory.pizza;

import com.potulad.learning.designpatterns.factory.ingredient.PizzaIngredient;
import com.potulad.learning.designpatterns.factory.ingredient.cheese.Cheese;
import com.potulad.learning.designpatterns.factory.ingredient.dough.Dough;
import com.potulad.learning.designpatterns.factory.ingredient.sauce.Sauce;
import lombok.AllArgsConstructor;

import java.util.List;

/**
 * Abstract class for Pizza related activities.
 */
@AllArgsConstructor
public class Pizza {

    /**
     * The cheese of the Pizza
     */
    private final Cheese cheese;

    /**
     * The sauce of the Pizza
     */
    private final Sauce sauce;

    /**
     * The dough of the Pizza
     */
    private final Dough dough;

    /**
     * The ingredients of the Pizza;
     */
    private final List<PizzaIngredient> pizzaIngredients;

    /**
     * Prepare a Pizza the generic way.
     */
    public void prepare() {
        System.out.println("Preparing PizzaStore(TM) way using the following ingredients : ");
        System.out.println("Cheese : " + cheese.getIngredientDescription());
        System.out.println("Sauce : " + sauce.getIngredientDescription());
        System.out.println("Dough : " + dough.getIngredientDescription());

        if(!pizzaIngredients.isEmpty()) {

            System.out.println("Other ingredients : ");
            for (PizzaIngredient ingredient : pizzaIngredients) {
                System.out.println(ingredient.getIngredientDescription());
            }
        }
    }
}
