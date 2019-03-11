import com.potulad.learning.designpatterns.observer.WeatherData;
import com.potulad.learning.designpatterns.observer.observers.CurrentHumidityDisplay;
import com.potulad.learning.designpatterns.util.SpringContext;

public class ObserverPatternTest {
    public static void main(String args[]) {
        final WeatherData weatherData = SpringContext.getBean("weatherData");
        weatherData.measurementsChanged(16.1, 360.4, 85.3);
        weatherData.measurementsChanged(15.3, 365.2, 87.4);

        final CurrentHumidityDisplay currentHumidityDisplay = SpringContext.getBean("currentHumidityDisplay");
        currentHumidityDisplay.unsubscribe();
        weatherData.measurementsChanged(17.2, 390.2, 97.23);

        currentHumidityDisplay.subscribe();
        weatherData.measurementsChanged(18.36, 410.12, 101.35);
    }
}
