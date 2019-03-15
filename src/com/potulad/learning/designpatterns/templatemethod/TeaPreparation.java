package com.potulad.learning.designpatterns.templatemethod;

/**
 * Class to make tea using the template method pattern. Also see {@link BeveragePreparation}
 */
public class TeaPreparation extends BeveragePreparation {

    @Override
    protected void init() {
        System.out.println("Get the cheap quality tea leaves!");
    }

    @Override
    protected void pourBeverageIntoPan() {
        System.out.println("Add tea leaves and water into a self-straining pan");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add lemon");
        System.out.println("Add honey");
    }
}
