package com.potulad.learning.designpatterns.facade;

/**
 * Class for making popcorn
 */
public class PopcornMachine {

    public void on() {
        System.out.println("Popcorn machine is on!");
    }

    public void off() {
        System.out.println("Popcorn machine is off!");
    }

    public void putKernels() {
        System.out.println("Corn kernels are in the machine");
    }

    public void heatKernels() {
        System.out.println("Heating kernels to make popcorn");
    }
}
