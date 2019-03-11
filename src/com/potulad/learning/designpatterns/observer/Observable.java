package com.potulad.learning.designpatterns.observer;

import lombok.NonNull;

/**
 * Observable class in the Observer pattern
 */
public interface Observable {

    /**
     * Notify all observers
     */
    void notifyObservers();

    /**
     * Add a new observer
     */
    void addObservers(@NonNull  Observer observer);

    /**
     * Remove observer
     */
    void removeObservers(@NonNull Observer observer);
}
