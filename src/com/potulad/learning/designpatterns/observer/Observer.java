package com.potulad.learning.designpatterns.observer;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

/**
 * Interface for observers of the {@link WeatherData} class.
 */
@AllArgsConstructor
@EqualsAndHashCode
public abstract class Observer {

    @NonNull
    @Getter
    private final WeatherData weatherData;

    /**
     * This function is called whenever the state of the weatherData object changes.
     */
    public abstract void update();

    /**
     * Unsubscribe to the state change updates of the weatherData object.
     */
    public void unsubscribe() {
        this.weatherData.removeObservers(this);
    }

    /**
     * Subscribe to the state change updates of the weatherData object.
     */
    public void subscribe() {
        this.weatherData.addObservers(this);
    }
}
