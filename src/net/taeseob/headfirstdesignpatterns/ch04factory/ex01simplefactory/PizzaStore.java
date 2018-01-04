package net.taeseob.headfirstdesignpatterns.ch04factory.ex01simplefactory;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex01simplefactory.pizza.Pizza;

public class PizzaStore {
	
	// [SimplePizzaFactory 사용을 위해 추가 된 부분]
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	// [SimplePizzaFactory 사용을 위해 추가 된 부분]
	
	
	Pizza orderPizza(String type) {
		Pizza pizza = null;
		
		/*
		 * 코드에서 구상 클래스를 많이 사용하면
		 * 새로운 구상 클래스가 추가될 때마다 코드를 고쳐야 하기 때문에
		 * 수많은 문제가 생길 수 있다.
		 * 즉, 변경에 대해 닫혀있지 않은
		 * OCP를 위반한 코드가 된다.
		 * 캡슐화가 필요하다.
		 * 
		 * SimplePizzaFactory 객체에서 전담하도록 변경.
		 * Pizza 객체 생성이 필요한 부분이 많아져도
		 * SimplePizzaFactory만 고치면 된다.
		 */
//		if (type.equals("cheese")) {
//			pizza = new CheesePizza();
//		} else if (type.equals("pepperoni")) {
//			pizza = new PepperoniPizza();
//		} else if (type.equals("clam")) {
//			pizza = new ClamPizza();
//		} else if (type.equals("veggie")) {
//			pizza = new VeggiePizza();
//		}
		
		/*
		 * [SimplePizzaFactory 사용을 위해 추가 된 부분]
		 * 팩토리를 써서 피자 객체를 만든다.
		 * 이제 더 이상 구상 클래스의 인스턴스를
		 * 직접 만들 필요가 없다.
		 */
		pizza = factory.createPizza(type);
		
		/*
		 * 이 부분은 바뀌지 않음.
		 * 어떤 피자 클래스의 메소드가
		 * 호출 되는지만 달라짐.
		 */
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
