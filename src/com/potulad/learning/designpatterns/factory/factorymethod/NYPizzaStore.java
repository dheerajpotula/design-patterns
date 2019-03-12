package com.potulad.learning.designpatterns.factory.factorymethod;

import com.potulad.learning.designpatterns.factory.abstractfactory.NYPizzaIngredientFactory;
import com.potulad.learning.designpatterns.factory.abstractfactory.PizzaIngredientFactory;

/**
 * Pizza Store for NY.
 */
public class NYPizzaStore extends PizzaStore {

    private final PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

    @Override
    protected PizzaIngredientFactory getPizzaIngredientFactory() {
        return pizzaIngredientFactory;
    }

    @Override
    public void box() {
        System.out.println("Delivering on NY PizzaStore(TM) box");
    }
}
