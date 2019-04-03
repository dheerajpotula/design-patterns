package com.potulad.learning.designpatterns.proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Utility class to register the Inventory System with the RMI registry
 *
 * How to run RMI registry properly. I am doing this on a Windows system.
 *
 * We have to have the rmiregisty running for the below main to compile properly.
 * We can run the rmi registry using `start rmiregistry` in windows.
 *
 * RMI Registry:
 * I started rmiregisty using this command from the root :
 * PWD: cd C:\Users\dheer\Projects\design-patterns\src
 * Command: start rmiregistry
 *
 * After running this command, a new command window will open with a blank screen
 *
 * Compilation commands:
 * PWD: cd C:\Users\dheer\Projects\design-patterns\src\com\potulad\learning\designpatterns\proxy\remote
 * Command: javac  -cp C:\Users\dheer\.m2\repository\org\projectlombok\lombok\1.16.4\lombok-1.16.4.jar *.java
 *
 * Running the Services:
 * PWD: cd C:\Users\dheer\Projects\design-patterns\src
 * Command: java com.potulad.learning.designpatterns.proxy.remote.SpeakerInventorSystemRemoteRegistry
 */
public class SpeakerInventorSystemRemoteRegistry {
    public static void main(String args[]) throws RemoteException {
        final SpeakerInventorySystem speakerInventorySystem
                = new SpeakerInventorySystemImpl(10, "seattle");
        final SpeakerInventorySystem speakerInventorySystem1
                = new SpeakerInventorySystemImpl(5, "boston");

        try {
            Naming.rebind(getSpeakerRemoteObjectName(speakerInventorySystem.getSpeakerInventorySystemName(),
                                                     speakerInventorySystem.getInventoryLocation()),
                          speakerInventorySystem);
            Naming.rebind(getSpeakerRemoteObjectName(speakerInventorySystem1.getSpeakerInventorySystemName(),
                                                     speakerInventorySystem1.getInventoryLocation()),
                          speakerInventorySystem1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static final String getSpeakerRemoteObjectName(String speakerSystemName, String speakerSystemLocation) {
        return speakerSystemName + "/" + speakerSystemLocation;
    }
}
