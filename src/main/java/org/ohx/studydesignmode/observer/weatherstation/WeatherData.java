package org.ohx.studydesignmode.observer.weatherstation;

import java.util.Observable;

/**
 * @author mudkip
 * @date 2022/7/22
 */
public class WeatherData extends Observable {
    private double temperature;
    private double humidity;
    private double pressure;

    /**
     * 变更观测值
     */
    private void measurementsChanged() {
        setChanged();
        // 调的是无参方法，说明需要观察者自己拉数据，不是主动推数据
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
