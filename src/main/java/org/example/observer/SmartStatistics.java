package org.example.observer;

public class SmartStatistics implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observeable weatherData;
    public SmartStatistics(Observeable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Temp \t"+ temperature + "\tPressure\t" + pressure + "\tHumidity\t" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
