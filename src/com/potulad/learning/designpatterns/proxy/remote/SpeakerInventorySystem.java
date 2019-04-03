package com.potulad.learning.designpatterns.proxy.remote;

import lombok.NonNull;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * A Speaker inventory system that allows us to query for the inventory and get items from the inventory 
 */
public interface SpeakerInventorySystem extends Remote {

    /**
     * The name of the speaker inventory system
     */
    @NonNull
    String getSpeakerInventorySystemName() throws RemoteException;

    /**
     * The inventory location of this speaker system.
     */
    @NonNull
    String getInventoryLocation() throws RemoteException;

    /**
     * The current number of available speakers within the inventory system 
     */
    int getCurrentNumberOfSpeakersAvailable() throws RemoteException;

    /**
     * Decrease the count of available Speakers within the inventory system
     * @throws IllegalArgumentException when the number of speakers to reduce are higher than the current inventory count
     */
    void reduceNumberOfSpeakersAvailable(int numberOfSpeakersToDeliver) throws IllegalArgumentException, RemoteException;

    /**
     * Refill speakers in the inventory
     */
    void refillNumberOfSpeakersAvailable(int numberOfSpeakersToRefill) throws RemoteException;
}
