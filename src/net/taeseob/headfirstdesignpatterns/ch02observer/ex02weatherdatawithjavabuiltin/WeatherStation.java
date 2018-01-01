package net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin;

import net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.display.CurrentConditionsDisplay;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.display.ForecastDisplay;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.display.HeatIndexDisplay;
import net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin.display.StatisticsDisplay;

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
		
		// ex01의 출력 결과와 순서가 반대 (Heat -> Forecast -> Statistics -> Current)
		// 옵저버한테 연락이 가는 순서에 의존하면 안 됨!!!
	}

}
