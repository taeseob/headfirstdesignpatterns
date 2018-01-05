package net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza;

import java.util.ArrayList;

// 제품(Product) 클래스
/*
 * 제품 클래스에서는 모두 똑같은 인터페이스를 구현해야 한다.
 * 그래야 제품을 사용할 클래스에서 구상 클래스가 아닌
 * 인터페이스에 대한 레퍼런스를 써서 객체를 참조할 수 있다.
 */
public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
	
}
