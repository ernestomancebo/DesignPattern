package ernesto.design.patterns.factory.pizza;

import ernesto.design.patterns.factory.ingredients.PizzaIngredientsFactory;

public class ClamPizza extends Pizza {

	PizzaIngredientsFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientsFactory ingredientsFactory) {
		this.ingredientFactory = ingredientsFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese= ingredientFactory.createCheese();
		clam  = ingredientFactory.createClam();
	}

}
