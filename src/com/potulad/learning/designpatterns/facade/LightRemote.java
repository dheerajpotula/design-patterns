package com.potulad.learning.designpatterns.facade;

/**
 * Class for turning lights on/off
 */
public class LightRemote {

    public void lightsOn() {
        System.out.println("Lights turning on");
    }

    public void lightsOff() {
        System.out.println("Lights are off");
    }

    public void dimLights() {
        System.out.println("Lights are dimmed!");
    }

}
