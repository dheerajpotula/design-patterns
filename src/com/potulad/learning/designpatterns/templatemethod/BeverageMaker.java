package com.potulad.learning.designpatterns.templatemethod;

import lombok.NonNull;

/**
 * Simple Factory for making beverages.
 */
public class BeverageMaker {

    public static BeveragePreparation getBeverage(@NonNull BeverageType beverageType) {
        switch (beverageType) {
            case COFFEE:
                return new CoffeePreparation();
            case TEA:
                return new TeaPreparation();
            default:
                throw new IllegalArgumentException("Unknown beverage type!" + beverageType);
        }
    }

    /**
     * Enum to hold the various beverage types.
     */
    public enum BeverageType {
        COFFEE,
        TEA
    }
}
