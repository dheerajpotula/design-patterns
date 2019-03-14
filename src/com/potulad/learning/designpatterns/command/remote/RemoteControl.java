package com.potulad.learning.designpatterns.command.remote;

import com.potulad.learning.designpatterns.command.remotecommands.RemoteCommand;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.Map;

/**
 * Remote Control interface
 */
@AllArgsConstructor
public class RemoteControl {

    /**
     * Hash map for the remote control slots. FYI - There are 10 slots in the remote control,
     * each slot can be empty or contain one remote command. The remote command can also be macro
     * level commands.
     */
    private final Map<Integer, RemoteCommand> remoteSlots;

    /**
     * Press a button on the remote.
     * @param slotNumber - The button to press (acceptable values from 1 - 10)
     */
    public void pressButton(int slotNumber) {
        System.out.println("Button pressed on slot : " + slotNumber);
        verifySlotNumber(slotNumber);
        remoteSlots.get(slotNumber).invoke();
    }

    /**
     * Insert the given command for the given slot.
     * @param slotNumber - The button to change (acceptable values from 1 - 10)
     * @param remoteCommand - The command to insert.
     */
    public void changeSlot(int slotNumber, @NonNull RemoteCommand remoteCommand) {
        verifySlotNumber(slotNumber);
        remoteSlots.put(slotNumber, remoteCommand);
    }

    private void verifySlotNumber(int slotNumber) {
        if(slotNumber < 1 || slotNumber > 10) {
            throw new IllegalArgumentException("slotNumber can only be between 1 and 10");
        }
    }
}
