package com.potulad.learning.designpatterns.command.remotecommands;

import com.potulad.learning.designpatterns.command.devices.Light;
import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * Light off command to turn off a given light
 */
@AllArgsConstructor
public class LightOffCommand implements RemoteCommand {

    @NonNull
    private final Light light;

    @Override
    public void invoke() {
        light.turnOff();
    }
}
