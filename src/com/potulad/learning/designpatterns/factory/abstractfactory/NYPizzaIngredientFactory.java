package com.potulad.learning.designpatterns.factory.abstractfactory;

import com.potulad.learning.designpatterns.factory.ingredient.cheese.Cheese;
import com.potulad.learning.designpatterns.factory.ingredient.cheese.NYCheese;
import com.potulad.learning.designpatterns.factory.ingredient.dough.Dough;
import com.potulad.learning.designpatterns.factory.ingredient.dough.NYDough;
import com.potulad.learning.designpatterns.factory.ingredient.sauce.NYSauce;
import com.potulad.learning.designpatterns.factory.ingredient.sauce.Sauce;

/**
 * Pizza Ingredient Factory just for NY.
 */
public class NYPizzaIngredientFactory extends PizzaIngredientFactory {

    @Override
    public Cheese getCheese() {
        return new NYCheese();
    }

    @Override
    public Sauce getSauce() {
        return new NYSauce();
    }

    @Override
    public Dough getDough() {
        return new NYDough();
    }
}
