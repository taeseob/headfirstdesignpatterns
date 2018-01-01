package net.taeseob.headfirstdesignpatterns.ch02observer.ex02weatherdatawithjavabuiltin;

import java.util.Observable;

public class WeatherData extends Observable {
	/* 
	 * 자바에서 몇 가지 API를 통해서 자체적으로 옵저버 패턴을 지원하기도 한다.
	 * 가장 일반적으로 쓸 수 있는 것으로 java.util 패키지에 들어있는
	 * Observer 인터페이스와 Observable 클래스를 들 수 있다.
	 * 이전 예제의 Observer와 Subject 인터페이스와 비슷하지만, 더 많은 기능들을 제공한다.
	 * 그리고 갱신 방식을 푸시 방식과 풀 방식 중 선택할 수 있다.
	 * 
	 * Observable은 클래스이므로 이미 다른 클래스를 확장하고 있는 클래스에는 기능을 추가할 수 없다.
	 */

	private float temperature;
	private float humidity;
	private float pressure;
	
	/*
	 * 옵저버들을 직접 챙기고 등록/탈되 등을 직접 관리하지 않아도 되기 때문에
	 * 등록, 추가, 연락 등을 위한 코드는 전부 필요 없음.
	 * 생성자에서 옵저버들을 저장하기 위한 자료 구조를 만들 필요도 없음.
	 */
//	public WeatherData() {
//		this.observers = new ArrayList<Observer>();
//	}
//
//	@Override
//	public void registerObserver(Observer o) {
//		this.observers.add(o);
//	}
//
//	@Override
//	public void removeObserver(Observer o) {
//		this.observers.remove(o);
//	}

//	@Override
//	public void notifyObservers() {
//		for (Observer o : this.observers) {
//			o.update(this.temperature, this.humidity, this.pressure);
//		}
//	}
	
	public void measurementsChanged() {
		// Observable.setChanged()를 사용해서 상태가 바뀌었다는 것을 알림
		// change 플래그를 true로 세팅
		this.setChanged();
		// clearChanged : changed 플래그를 false로 돌려놓음
		// hasChanged : changed 플래그의 현재 상태
		
		// notifyObservers 메소드를 직접 구현하지 않고 Observable의 것을 사용
		// Observable.notifyObservers()를 호출할 때 데이터 객체를 보내지 않음 (풀 모델 사용)
		// 푸시 모델 사용할때는 notifyObservers(Object arg) 형태로 사용
		this.notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
