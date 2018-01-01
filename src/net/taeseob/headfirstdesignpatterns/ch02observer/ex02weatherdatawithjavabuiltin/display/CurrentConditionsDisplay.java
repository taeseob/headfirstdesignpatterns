package net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.display;

import java.util.Observable;
import java.util.Observer;

import net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
//	private Subject weatherData;
	Observable observable;
	
//	public CurrentConditionsDisplay(Subject weatherData) {
//		this.weatherData = weatherData;
//		this.weatherData.registerObserver(this);
//	}
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
		// 목록에서 탈퇴하고 싶을 땐 deleteObserver 메소드 사용
	}
	
//	public void update(float temperature, float humidity, float pressure) {
//		this.temperature = temperature;
//		this.humidity = humidity;
//		this.display();
//	}
	
	@Override
	public void update(Observable observable, Object arg) {
		// Object arg : notifyObservers 메소드에서 인자로 전달 된 데이터 객체
		// 지정되지 않은 경우에는 null
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.display();
		}
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
	
}
