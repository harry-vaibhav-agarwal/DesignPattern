package org.example.observer;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        WeatherData weatherData = new WeatherData();
        CurrentStatistics currentStatistics = new CurrentStatistics(weatherData);
        SmartStatistics smartStatistics = new SmartStatistics(weatherData);
        weatherData.setMeasurements(2,4,3);
    }
}