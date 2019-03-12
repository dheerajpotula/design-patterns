package com.potulad.learning.designpatterns.factory.abstractfactory;

import com.potulad.learning.designpatterns.factory.ingredient.cheese.Cheese;
import com.potulad.learning.designpatterns.factory.ingredient.cheese.ChicagoCheese;
import com.potulad.learning.designpatterns.factory.ingredient.dough.ChicagoDough;
import com.potulad.learning.designpatterns.factory.ingredient.dough.Dough;
import com.potulad.learning.designpatterns.factory.ingredient.sauce.ChicagoSauce;
import com.potulad.learning.designpatterns.factory.ingredient.sauce.Sauce;

/**
 * Pizza Ingredient Factory just for Chicago.
 */
public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {

    @Override
    public Cheese getCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Sauce getSauce() {
        return new ChicagoSauce();
    }

    @Override
    public Dough getDough() {
        return new ChicagoDough();
    }
}
