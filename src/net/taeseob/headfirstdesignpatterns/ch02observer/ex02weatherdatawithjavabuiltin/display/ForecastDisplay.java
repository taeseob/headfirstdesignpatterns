package net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.display;

import java.util.Observable;
import java.util.Observer;

import net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private float currentPressure = 29.92f;  
	private float lastPressure;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			this.lastPressure = this.currentPressure;
	        this.currentPressure = weatherData.getPressure();
	        this.display();
		}
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
