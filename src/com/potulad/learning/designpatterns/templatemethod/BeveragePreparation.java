package com.potulad.learning.designpatterns.templatemethod;

/**
 * Abstract class for preparing a beverage.
 */
public abstract class BeveragePreparation {

    /**
     * Template method to make a beverage.
     *
     * @implNote This is a time-tested method and should not be modified.
     */
    public final void makeBeverage() {
        init();
        pourBeverageIntoPan();
        heatBeverage();
        pourBeverageIntoCup();
        addCondiments();
        wrapUp();
    }

    /**
     * First method for subclasses to hook into. Voluntarily left blank
     */
    protected void init() {
        // no need to init anything in the base class
    }

    /**
     * Pour a beverage into pan. Allow subclasses to decide the type of beverage to
     * pour.
     */
    protected abstract void pourBeverageIntoPan();

    /**
     * Heat the beverage till it boils. Assuming that all beverages boil and we can
     * detect exactly when a beverage has reached boiling point.
     */
    protected void heatBeverage() {
        try {
            System.out.println("Beverage is boiling");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println("..");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("....");
            Thread.sleep(1000);
            System.out.println("Beverage has reached boiling point");
        } catch (InterruptedException ex) {
            // Avoiding checked exception by wrapping into runtime.
            throw new RuntimeException(ex);
        }
    }

    /**
     * Pour the boiled beverage into a cup
     */
    protected void pourBeverageIntoCup() {
        System.out.println("Pouring hot beverage into a cup");
    }

    /**
     * Allow subclasses to decide which condiments they want to add
     */
    protected abstract void addCondiments();

    /**
     * Final hook into the template method. Voluntarily left blank by default
     */
    protected void wrapUp() {
        // No need to wrap up anything in the base class.
    }
}
