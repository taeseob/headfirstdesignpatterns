package net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.subject;

import net.taeseob.headfirstdesignpatterns.ch02observer.ex01weatherdata.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
