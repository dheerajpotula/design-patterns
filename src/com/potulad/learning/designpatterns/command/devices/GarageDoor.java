package com.potulad.learning.designpatterns.command.devices;

/**
 * Garage Door to open/close the garage door
 */
public class GarageDoor {

    public void up() {
        System.out.println("Garage Door is up!");
    }

    public void down() {
        System.out.println("Garage Door is down!");
    }
}
