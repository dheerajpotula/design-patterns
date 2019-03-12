package com.potulad.learning.designpatterns.factory.factorymethod;

import com.google.common.collect.ImmutableList;
import com.potulad.learning.designpatterns.factory.abstractfactory.PizzaIngredientFactory;
import com.potulad.learning.designpatterns.factory.pizza.Pizza;
import com.potulad.learning.designpatterns.factory.pizza.PizzaType;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.Collections;

/**
 * Abstract class for all Pizza Store franchises
 */
@AllArgsConstructor
public abstract class PizzaStore {

    public void orderPizza(@NonNull PizzaType pizzaType) {
        final Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        bake();
        cut();
        box();
        System.out.println();
    }

    /**
     * Create pizzas based on the Pizza Type.
     */
    private Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new Pizza(getPizzaIngredientFactory().getCheese(),
                        getPizzaIngredientFactory().getSauce(),
                        getPizzaIngredientFactory().getDough(),
                        Collections.emptyList());
            case CHICKEN:
                return new Pizza(getPizzaIngredientFactory().getCheese(),
                        getPizzaIngredientFactory().getSauce(),
                        getPizzaIngredientFactory().getDough(),
                        ImmutableList.of(getPizzaIngredientFactory().getChicken()));
            case PEPPERONI:
                return new Pizza(getPizzaIngredientFactory().getCheese(),
                        getPizzaIngredientFactory().getSauce(),
                        getPizzaIngredientFactory().getDough(),
                        ImmutableList.of(getPizzaIngredientFactory().getPepperoni()));
            case PINEAPPLE:
                return new Pizza(getPizzaIngredientFactory().getCheese(),
                        getPizzaIngredientFactory().getSauce(),
                        getPizzaIngredientFactory().getDough(),
                        ImmutableList.of(getPizzaIngredientFactory().getPineapple()));
            default:
                throw new IllegalArgumentException("Unknown Pizza Type!");
        }
    }

    /**
     * Bake a Pizza the generic way.
     */
    public void bake() {
        System.out.println("Baking at 450 degrees F the PizzaStore(TM) way");
    }

    /**
     * Cut a Pizza the generic way.
     */
    public void cut() {
        System.out.println("Cutting into 6 slices the PizzaStore(TM) way");
    }

    /**
     * Box a Pizza the generic way.
     */
    public void box() {
        System.out.println("Delivering on PizzaStore(TM) box");
    }

    /**
     * Factory Method to allow the subclasses to supply their own pizza ingredient Factory.
     */
    protected abstract PizzaIngredientFactory getPizzaIngredientFactory();
}
