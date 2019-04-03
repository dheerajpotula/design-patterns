package com.potulad.learning.designpatterns.proxy.remote;

import lombok.NonNull;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Class the continually monitors and places orders to the remote inventory system. Assumes that you have RMI registry
 * setup and running and the Remote classes have been registered with the RMI registry. See {@link SpeakerInventorySystemImpl}
 * for more info.
 *
 * Once the above setup is complete, you can just run the main method below either from IDE or from the command line.
 */
public class ContinousMonitorInventory {
    public static void main(String args[]) throws Exception {
        final SpeakerInventorySystem speakerInventorySystem =
                (SpeakerInventorySystem) Naming.lookup("rmi://127.0.0.1/SpeakerInventorySystem/seattle");

        final SpeakerInventorySystem speakerInventorySystem1 =
                (SpeakerInventorySystem) Naming.lookup("rmi://127.0.0.1/SpeakerInventorySystem/boston");

        printSystemInventoryDetails(speakerInventorySystem);
        printSystemInventoryDetails(speakerInventorySystem1);

        speakerInventorySystem.reduceNumberOfSpeakersAvailable(5);
        printSystemInventoryDetails(speakerInventorySystem);

        speakerInventorySystem1.refillNumberOfSpeakersAvailable(10);
        printSystemInventoryDetails(speakerInventorySystem1);

        speakerInventorySystem1.reduceNumberOfSpeakersAvailable(3);
        printSystemInventoryDetails(speakerInventorySystem1);

        speakerInventorySystem.refillNumberOfSpeakersAvailable(10);
        printSystemInventoryDetails(speakerInventorySystem);

        while(true) {
            printSystemInventoryDetails(speakerInventorySystem);
            printSystemInventoryDetails(speakerInventorySystem1);
            Thread.sleep(5000);
        }
    }

    private static void printSystemInventoryDetails(@NonNull SpeakerInventorySystem speakerInventorySystem) throws RemoteException  {
        System.out.println(speakerInventorySystem.getSpeakerInventorySystemName() + "/" + speakerInventorySystem.getInventoryLocation());
        System.out.println(speakerInventorySystem.getCurrentNumberOfSpeakersAvailable());
    }

}
