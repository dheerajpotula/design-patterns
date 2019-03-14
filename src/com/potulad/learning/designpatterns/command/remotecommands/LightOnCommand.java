package com.potulad.learning.designpatterns.command.remotecommands;

import com.potulad.learning.designpatterns.command.devices.Light;
import lombok.AllArgsConstructor;

/**
 * Command to turn on a given light
 */
@AllArgsConstructor
public class LightOnCommand implements RemoteCommand {

    private final Light light;

    @Override
    public void invoke() {
        light.turnOn();
    }
}
