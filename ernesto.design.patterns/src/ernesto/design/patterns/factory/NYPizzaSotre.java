package ernesto.design.patterns.factory;

import ernesto.design.patterns.factory.ingredients.NYPizzaIngredientFactory;
import ernesto.design.patterns.factory.ingredients.PizzaIngredientsFactory;
import ernesto.design.patterns.factory.pizza.CheesePizza;
import ernesto.design.patterns.factory.pizza.ClamPizza;
import ernesto.design.patterns.factory.pizza.PepperoniPizza;
import ernesto.design.patterns.factory.pizza.Pizza;
import ernesto.design.patterns.factory.pizza.VeggiePizza;

public class NYPizzaSotre extends PizzaStore {

	@Override
	Pizza createPizza(String type) {		
		Pizza pizza = null;
		PizzaIngredientsFactory ingredientFactory =  new NYPizzaIngredientFactory();
		
		if(type.equalsIgnoreCase("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("NY Style Cheese Pizza");
		} else if(type.equalsIgnoreCase("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("NY Style Pepperoni Pizza");
		} else if(type.equalsIgnoreCase("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("NY Style Veggie Pizza");
		} else if(type.equalsIgnoreCase("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("NY Style Clam Pizza");
		}
		
		return pizza;
	}

}
