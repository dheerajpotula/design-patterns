package com.potulad.learning.designpatterns.observer.observers;

import com.potulad.learning.designpatterns.observer.Observer;
import com.potulad.learning.designpatterns.observer.WeatherData;
import lombok.NonNull;

/**
 * Display that prints the current pressure.
 */
public class CurrentPressureDisplay extends Observer {

    /**
     * Register as an observer for the weather data object
     */
    public CurrentPressureDisplay(@NonNull WeatherData weatherData) {
        super(weatherData);
        weatherData.addObservers(this);
    }

    @Override
    public void update() {
        System.out.println("Current Pressure Display : (Pressure :  " + getWeatherData().getPressure() + " )");
    }
}
