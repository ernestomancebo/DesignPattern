package ernesto.design.patterns.factory;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {		
		if(type.equalsIgnoreCase("cheese")) {
			return new NYStyleCheesePizza();
		} else if(type.equalsIgnoreCase("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else{
			return null;
		}
	}

}
