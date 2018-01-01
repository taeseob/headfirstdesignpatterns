package net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata;

import java.util.ArrayList;

public class WeatherData implements Subject {
	/* 
	 * 옵저버 패턴에서는
	 * 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고
	 * 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의한다.
	 * 
	 * 2장의 객체지향 디자인 원칙 :
	 * 서로 상호작용을 하는 객체 사이에서는
	 * 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
	 * 
	 * 두 객체가 느슨하게 결합되어 있다는 것은,
	 * 그 둘이 상호작용을 하긴 하지만
	 * 서로에 대해 서로 잘 모른다는 것을 의미한다.
	 * 
	 * 주제가 옵저버에 대해서 아는 것은 옵저버가 Observer 인터페이스를 구현한다는 것 뿐,
	 * 옵저버의 구상 클래스가 무엇인지, 옵저버가 무엇을 하는지 등에 대해서는 알 필요가 없다.
	 * 
	 * 근데 Subject 역할은 이거 하나 뿐. Subject interface 필요한가?
	 */

//	public void measurementsChanged() {
//		
//		float temp = getTemperature();
//		float humidity = getHumidity();
//		float pressure = getPressure();
//		
//		/*
//		 * 바뀔 수 있는 부분. 캡슐화 해야 한다.
//		 * 구체적인 구현에 맞춰서 코딩했기 때문에
//		 * 프로그램을 고치지 않고는 다른 디스플레이 항목을 추가/제거할 수 없다.
//		 */
//		currentConditionsDisplay.update(temp, humidity, pressure);
//		statisticsDisplay.update(temp, humidity, pressure);
//		forecastDisplay.update(temp, humidity, pressure);
//	
//	}
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : this.observers) {
			o.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	public void measurementsChanged() {
		this.notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

}
