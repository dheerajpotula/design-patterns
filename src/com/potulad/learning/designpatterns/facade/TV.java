package com.potulad.learning.designpatterns.facade;

/**
 * Class for interacting with a TV.
 */
public class TV {
    public void turnOn() {
        System.out.println("TV is now on!");
    }

    public void turnOff() {
        System.out.println("TV is off!");
    }

    public void setChannel(String channelName) {
        System.out.println("TV channel changed to " + channelName);
    }
}

