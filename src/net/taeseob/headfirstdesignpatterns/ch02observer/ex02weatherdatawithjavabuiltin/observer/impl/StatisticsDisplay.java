package net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.observer.impl;

import java.util.Observable;
import java.util.Observer;

import net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.DisplayElement;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.observable.ext.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;

	public StatisticsDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			this.tempSum += weatherData.getTemperature();
			this.numReadings++;
			
			if (weatherData.getTemperature() > this.maxTemp) {
				this.maxTemp = weatherData.getTemperature();
			}
			
			if (weatherData.getTemperature() < this.minTemp) {
				this.minTemp = weatherData.getTemperature();
			}
			
			this.display();
		}
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}
	
}
