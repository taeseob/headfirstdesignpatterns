package net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
