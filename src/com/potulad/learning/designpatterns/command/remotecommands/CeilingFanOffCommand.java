package com.potulad.learning.designpatterns.command.remotecommands;

import com.potulad.learning.designpatterns.command.devices.CeilingFan;
import lombok.AllArgsConstructor;

/**
 * Command to turn off a ceiling fan
 */
@AllArgsConstructor
public class CeilingFanOffCommand implements RemoteCommand {

    private final CeilingFan ceilingFan;

    @Override
    public void invoke() {
        ceilingFan.off();
    }
}
