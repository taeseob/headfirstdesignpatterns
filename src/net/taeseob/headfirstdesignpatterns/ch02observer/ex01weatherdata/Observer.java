package net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata;

public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
