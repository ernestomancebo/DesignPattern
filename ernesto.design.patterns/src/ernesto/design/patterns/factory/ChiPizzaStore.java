package ernesto.design.patterns.factory;

import ernesto.design.patterns.factory.pizza.ChiStyleCheesePizza;
import ernesto.design.patterns.factory.pizza.ChiStylePepperoniPizza;
import ernesto.design.patterns.factory.pizza.Pizza;

public class ChiPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if(type.equalsIgnoreCase("cheese")) {
			return new ChiStyleCheesePizza();
		} else if(type.equalsIgnoreCase("pepperoni")) {
			return new ChiStylePepperoniPizza();
		} else{
			return null;
		}
	}

}
