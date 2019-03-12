package com.potulad.learning.designpatterns.factory.abstractfactory;

import com.potulad.learning.designpatterns.factory.ingredient.cheese.Cheese;
import com.potulad.learning.designpatterns.factory.ingredient.dough.Dough;
import com.potulad.learning.designpatterns.factory.ingredient.sauce.Sauce;
import com.potulad.learning.designpatterns.factory.ingredient.topping.Chicken;
import com.potulad.learning.designpatterns.factory.ingredient.topping.Pepperoni;
import com.potulad.learning.designpatterns.factory.ingredient.topping.Pineapple;

/**
 * Abstract Factory for all Pizza Ingredients.
 */
public abstract class PizzaIngredientFactory {

    /**
     * Assuming Chicken tastes the same everywhere.
     */
    public Chicken getChicken() {
        return new Chicken();
    }

    /**
     * Assuming Pepperoni tastes the same everywhere.
     */
    public Pepperoni getPepperoni() {
        return new Pepperoni();
    }

    /**
     * Assuming Pineapple tastes the same everywhere.
     */
    public Pineapple getPineapple() {
        return new Pineapple();
    }

    /**
     * Allow subclasses to supply the type of Cheese they want.
     */
    public abstract Cheese getCheese();

    /**
     * Allow subclasses to supply the type of Sauce they want.
     */
    public abstract Sauce getSauce();

    /**
     * Allow subclasess to supply the type of Dough they want.
     */
    public abstract Dough getDough();
}
