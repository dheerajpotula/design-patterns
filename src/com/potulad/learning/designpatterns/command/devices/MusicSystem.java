package com.potulad.learning.designpatterns.command.devices;

import lombok.Getter;

/**
 * Music System class to turn on/off and tweak the volume. The system remembers the last known volume.
 */
public class MusicSystem {

    @Getter
    private int volume = 10;

    public void on() {
        System.out.println("Music system turned on! (Volume at )" + volume);
    }

    public void setVolume(int volume) {
        if(volume < 0 || volume > 100) {
            throw new IllegalArgumentException("Volume should be between 0 and 100");
        }
        this.volume = volume;
        System.out.println("Volume is now at " + this.volume);
    }

    public void off() {
        System.out.println("Music System turned off!");
    }

}
