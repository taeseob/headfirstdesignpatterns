package net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata;

import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.observer.impl.CurrentConditionsDisplay;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.observer.impl.ForecastDisplay;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.observer.impl.HeatIndexDisplay;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.observer.impl.StatisticsDisplay;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.subject.impl.WeatherData;

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
