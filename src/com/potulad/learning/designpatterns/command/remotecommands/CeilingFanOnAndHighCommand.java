package com.potulad.learning.designpatterns.command.remotecommands;

import com.potulad.learning.designpatterns.command.devices.CeilingFan;
import lombok.AllArgsConstructor;

/**
 * Command to turn on the ceiling fan and set it to high.
 */
@AllArgsConstructor
public class CeilingFanOnAndHighCommand implements RemoteCommand {

    private final CeilingFan ceilingFan;

    @Override
    public void invoke() {
        ceilingFan.on();
        ceilingFan.high();
    }

}
