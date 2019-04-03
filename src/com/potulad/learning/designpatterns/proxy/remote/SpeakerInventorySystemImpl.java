package com.potulad.learning.designpatterns.proxy.remote;

import lombok.NonNull;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * A remote implementation of the Speaker System
 */
public class SpeakerInventorySystemImpl extends UnicastRemoteObject implements SpeakerInventorySystem {

    private static final long serialVersionUID = 1L;

    private static final String SPEAKER_SYSTEM_NAME = "SpeakerInventorySystem";
    /**
     * The number of Speakers that are currently available within the inventory.
     */
    private int numberOfSpeakersAvailable;

    /**
     * The location of this inventory system.
     */
    @NonNull
    private final String inventoryLocation;

    public SpeakerInventorySystemImpl(int numberOfSpeakersAvailable, @NonNull String inventoryLocation) throws RemoteException  {
        this.numberOfSpeakersAvailable = numberOfSpeakersAvailable;
        this.inventoryLocation = inventoryLocation;
    }

    @Override
    public String getSpeakerInventorySystemName() {
        return SPEAKER_SYSTEM_NAME;
    }

    @Override
    public String getInventoryLocation() {
        return this.inventoryLocation;
    }

    @Override
    public int getCurrentNumberOfSpeakersAvailable() {
        return this.numberOfSpeakersAvailable;
    }

    @Override
    public void reduceNumberOfSpeakersAvailable(int numberOfSpeakersToDeliver) throws IllegalArgumentException {
        if(this.numberOfSpeakersAvailable - numberOfSpeakersToDeliver >= 0) {
            this.numberOfSpeakersAvailable = this.numberOfSpeakersAvailable - numberOfSpeakersToDeliver;
            return;
        }
        throw new IllegalArgumentException("No of speakers requested is more than the number of speakers available");
    }

    @Override
    public void refillNumberOfSpeakersAvailable(int numberOfSpeakersToRefill) {
        this.numberOfSpeakersAvailable = numberOfSpeakersToRefill + numberOfSpeakersToRefill;
    }
}
