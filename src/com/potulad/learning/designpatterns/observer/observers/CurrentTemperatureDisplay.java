package com.potulad.learning.designpatterns.observer.observers;

import com.potulad.learning.designpatterns.observer.Observer;
import com.potulad.learning.designpatterns.observer.WeatherData;
import lombok.NonNull;

/**
 * Display that prints the current temperature.
 */
public class CurrentTemperatureDisplay extends Observer {

    /**
     * Register as an observer for the weather data object
     */
    public CurrentTemperatureDisplay(@NonNull WeatherData weatherData) {
        super(weatherData);
        weatherData.addObservers(this);
    }

    @Override
    public void update() {
        System.out.println("Current Temperature Display : (Temperature :  " + getWeatherData().getTemperature() + " )");
    }
}
