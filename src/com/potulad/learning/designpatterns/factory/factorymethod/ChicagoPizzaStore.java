package com.potulad.learning.designpatterns.factory.factorymethod;

import com.potulad.learning.designpatterns.factory.abstractfactory.ChicagoPizzaIngredientFactory;
import com.potulad.learning.designpatterns.factory.abstractfactory.PizzaIngredientFactory;

/**
 * Pizza Store for Chicago.
 */
public class ChicagoPizzaStore extends PizzaStore {

    private final PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    protected PizzaIngredientFactory getPizzaIngredientFactory() {
        return pizzaIngredientFactory;
    }

    @Override
    public void cut() {
        System.out.println("Cutting into 4 square slices the Chicago PizzaStore(TM) way");
    }
}
