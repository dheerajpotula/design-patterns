package com.potulad.learning.designpatterns.command.remotecommands;

/**
 * Interface to abstract method invocation.
 */
public interface RemoteCommand {

    /**
     * Function that individual remote commands will implement.
     */
    void invoke();
}
