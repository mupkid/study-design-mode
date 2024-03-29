package org.ohx.studydesignmode.observer.weatherstation;

import java.util.Observable;
import java.util.Observer;

/**
 * @author mudkip
 * @date 2022/7/22
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Observable observable;
    private double temperature;
    private double humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
