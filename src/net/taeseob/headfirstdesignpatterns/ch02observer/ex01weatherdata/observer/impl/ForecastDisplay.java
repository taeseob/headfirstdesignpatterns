package net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.observer.impl;

import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.DisplayElement;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.observer.Observer;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.subject.impl.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        this.display();
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (this.currentPressure > this.lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (this.currentPressure == this.lastPressure) {
			System.out.println("More of the same");
		} else if (this.currentPressure < this.lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
	
}
