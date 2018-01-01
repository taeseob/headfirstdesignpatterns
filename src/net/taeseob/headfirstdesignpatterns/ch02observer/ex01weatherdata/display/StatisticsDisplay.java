package net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.display;

import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.Observer;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.tempSum += temperature;
		this.numReadings++;

		if (temperature > this.maxTemp) {
			this.maxTemp = temperature;
		}
		
		if (temperature < this.minTemp) {
			this.minTemp = temperature;
		}

		this.display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}
	
}
