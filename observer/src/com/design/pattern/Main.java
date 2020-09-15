package com.design.pattern;

import com.design.pattern.example1.CurrentConditionDisplay;
import com.design.pattern.example1.WeatherData;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(25, 70, 220);
    }
}
