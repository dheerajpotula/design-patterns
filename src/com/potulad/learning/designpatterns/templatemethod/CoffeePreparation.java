package com.potulad.learning.designpatterns.templatemethod;

/**
 * Class to make a coffee using the template method pattern. Also see {@link BeveragePreparation}
 */
public class CoffeePreparation extends BeveragePreparation {

    /**
     * Pour coffee grounds and water into a self-straining pan.
     */
    @Override
    protected void pourBeverageIntoPan() {
        System.out.println("Pour coffee grounds and water into a self-straining pan");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add cocoa powder");
        System.out.println("Add sugar");
    }

    @Override
    protected void wrapUp() {
        System.out.println("Make funny shapes on the coffee foam");
    }
}
