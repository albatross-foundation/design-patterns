package com.design.pattern.example2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, Display {

    protected Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "C and " + humidity + "%");
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
