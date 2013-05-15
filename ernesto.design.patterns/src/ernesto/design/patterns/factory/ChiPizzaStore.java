package ernesto.design.patterns.factory;

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
