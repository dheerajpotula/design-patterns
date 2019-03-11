package com.potulad.learning.designpatterns.observer.observers;

import com.potulad.learning.designpatterns.observer.Observer;
import com.potulad.learning.designpatterns.observer.WeatherData;
import lombok.NonNull;

import java.util.Random;

/**
 * Display that prints if it will be a good beach day based on the weather readings. (if only this were true).
 */
public class GoodBeachDayPrediction extends Observer {

    /**
     * Register as an observer for the weather data object
     */
    public GoodBeachDayPrediction(@NonNull WeatherData weatherData) {
        super(weatherData);
        weatherData.addObservers(this);
    }

    @Override
    public void update() {
        final Double temp = getWeatherData().getTemperature();
        final Double pressure = getWeatherData().getPressure();
        final Double humidity = getWeatherData().getHumidity();

        Random random = new Random();
        final Double magicDouble = random.nextDouble();
        final Integer magicInteger = random.nextInt();

        final Double odds = ((magicDouble * magicInteger * temp) / (pressure * humidity)) / 100;

        System.out.println("Good Beach Day Prediction : ( "  + ( odds > 0.5 ? "Yes" : "No" ) + " )") ;
    }
}
