package com.potulad.learning.designpatterns.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * The WeatherData object that is to be observed by multiple objects.
 */
@AllArgsConstructor
public class WeatherData implements Observable {

    private final List<Observer> observerList = new ArrayList<>();

    /**
     * Temperature reading.
     */
    @NonNull
    @Getter
    private Double temperature;

    /**
     * Humidity reading
     */
    @NonNull
    @Getter
    private Double humidity;

    /**
     * Pressure reading.
     */
    @NonNull
    @Getter
    private Double pressure;

    /**
     * Notify all observers of the state change!
     */
    @Override
    public void notifyObservers() {
       observerList
           .stream()
           .forEach(observer ->
                   observer.update());
    }

    /**
     * Add a new observer. Can contain duplicates
     */
    @Override
    public void addObservers(@NonNull Observer observer) {
        observerList.add(observer);
    }

    /**
     * Removes the first occurrence of the observer.
     *
     * @throws IllegalArgumentException if there is no given observer in the list of observers.
     */
    @Override
    public void removeObservers(@NonNull Observer observer) {
        if(observerList.isEmpty() || !observerList.contains(observer)) {
            throw new IllegalArgumentException("Observer " + observer.getClass() + " doesn't exist!");
        }

        observerList.remove(observer);
    }

    /**
     * Function to be called when new measurements are recorded. Notifies the observers of the state change.
     *
     * @param temperature - new temperature value
     * @param humidity - new humidity value
     * @param pressure - new pressure value.
     */
    public void measurementsChanged(@NonNull Double temperature,
                                    @NonNull Double humidity,
                                    @NonNull Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
        System.out.println();
    }
}
