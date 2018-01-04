package net.taeseob.headfirstdesignpatterns.ch04factory.ex01simplefactory;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex01simplefactory.pizza.CheesePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex01simplefactory.pizza.ClamPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex01simplefactory.pizza.PepperoniPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex01simplefactory.pizza.Pizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex01simplefactory.pizza.VeggiePizza;

public class SimplePizzaFactory {

	/*
	 * 정적 메소드를 쓰면 SimplePizzaFactory 객체의 인스턴스를 만들지 않아도 된다.
	 * 하지만 서브클래스를 만들어서 객체 생성 메소드의 행동을 변경시킬 수 없다는 단점이 있다.
	 * 
	 * 간단한 팩토리(Simple Factory)는 디자인 패턴이라고 할 수는 없고
	 * 자주 쓰이는 관용구에 가깝다고 할 수 있다. 
	 */
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
