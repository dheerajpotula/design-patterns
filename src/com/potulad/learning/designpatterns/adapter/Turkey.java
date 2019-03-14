package com.potulad.learning.designpatterns.adapter;

/**
 * Turkey class that does turkey stuff
 */
public class Turkey {

    /**
     * A Turkey has to gobble
     */
    public void gobble() {
        System.out.println("Gobble Gobble Gobble");
    }

    /**
     * A Turkey flies (but not that long)
     */
    public void fly() {
        System.out.println("Flying for 1 meters");
    }

    public void display() {
        System.out.println("I am a simple turkey");
    }
}
