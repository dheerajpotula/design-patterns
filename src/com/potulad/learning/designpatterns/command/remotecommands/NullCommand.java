package com.potulad.learning.designpatterns.command.remotecommands;

/**
 * Null command that does nothing. (Follows the null object pattern, avoids handling null checks in
 * the remote control code).
 */
public class NullCommand implements RemoteCommand {

    @Override
    public void invoke() {
        // Empty by design! Since null objects do nothing.
    }
}
