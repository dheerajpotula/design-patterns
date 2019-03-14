package com.potulad.learning.designpatterns.command.devices;

/**
 * Ceiling fan class for operations on a ceiling fan. Always starts at low speed.
 */
public class CeilingFan {

    public void on() {
        System.out.println("Ceiling fan turned on!");
        low();
    }

    public void off() {
        System.out.println("Ceiling fan turned off!");
    }

    public void low() {
        System.out.println("Ceiling fan speed set at low");
    }

    public void medium () {
        System.out.println("Ceiling fan speed set at medium");
    }

    public void high() {
        System.out.println("Ceiling fan speed set at high");
    }
}
