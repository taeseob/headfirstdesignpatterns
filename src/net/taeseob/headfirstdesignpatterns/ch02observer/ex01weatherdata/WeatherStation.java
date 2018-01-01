package net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata;

import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.display.CurrentConditionsDisplay;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.display.ForecastDisplay;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.display.HeatIndexDisplay;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.display.StatisticsDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay headIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
