package com.potulad.learning.designpatterns.facade;

import lombok.AllArgsConstructor;

/**
 * Facade for Home Theatre system.
 */
@AllArgsConstructor
public class HomeTheatre {

    private final LightRemote lightRemote;

    private final PopcornMachine popcornMachine;

    private final SpeakerSystem speakerSystem;

    private final TV tv;

    public void prepForMovie() {
        lightRemote.lightsOn();
        lightRemote.dimLights();

        popcornMachine.on();
        popcornMachine.putKernels();
        popcornMachine.heatKernels();

        speakerSystem.on();
        speakerSystem.setVolume(90);

        tv.turnOn();
        tv.setChannel("Cricket");
    }

    public void turnOffMovie() {
        lightRemote.lightsOff();
        popcornMachine.off();
        speakerSystem.off();
        tv.turnOff();
    }
}
