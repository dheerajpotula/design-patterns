package com.potulad.learning.designpatterns.command.remotecommands;

import com.potulad.learning.designpatterns.command.devices.MusicSystem;
import lombok.AllArgsConstructor;

/**
 * Command to turn on the Music System and set volume at 50
 */
@AllArgsConstructor
public class MusicSystemOnCommand implements RemoteCommand {

    private final MusicSystem musicSystem;

    @Override
    public void invoke() {
        musicSystem.on();
        musicSystem.setVolume(50);
    }
}
