package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observeable {
    private List<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature,float pressure,float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
           observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index!=-1)
            observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(temperature,humidity,pressure);
        }
        );
    }
}
