package com.potulad.learning.designpatterns.facade;

/**
 * Class for interacting with a speaker system.
 */
public class SpeakerSystem {

    public void on() {
        System.out.println("Speaker System is now on!");
    }

    public void off() {
        System.out.println("Speaker System is now off!");
    }

    public void setVolume(int volume) {
        System.out.println("Speaker System's volume is set at " + volume);
    }
}
