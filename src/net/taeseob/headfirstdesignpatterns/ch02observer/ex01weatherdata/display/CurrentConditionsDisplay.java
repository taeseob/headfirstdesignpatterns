package net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.display;

import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.Observer;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
	
}
