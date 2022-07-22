package org.ohx.studydesignmode.observer;

import org.junit.jupiter.api.Test;
import org.ohx.studydesignmode.observer.weatherstation.CurrentConditionDisplay;
import org.ohx.studydesignmode.observer.weatherstation.WeatherData;

/**
 * @author mudkip
 * @date 2022/7/22
 */
public class WeatherStationTest {
    @Test
    public void test1() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4);
        weatherData.setMeasurements(82, 70, 29.2);
        weatherData.setMeasurements(78, 90, 29.2);
    }
}
