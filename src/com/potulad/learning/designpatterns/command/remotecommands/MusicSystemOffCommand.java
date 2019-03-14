package com.potulad.learning.designpatterns.command.remotecommands;

import com.potulad.learning.designpatterns.command.devices.MusicSystem;
import lombok.AllArgsConstructor;

/**
 * Command to turn off the music system.
 */
@AllArgsConstructor
public class MusicSystemOffCommand implements RemoteCommand {

    private final MusicSystem musicSystem;

    @Override
    public void invoke() {
        musicSystem.off();
    }
}
