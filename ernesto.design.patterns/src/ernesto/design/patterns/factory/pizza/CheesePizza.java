package ernesto.design.patterns.factory.pizza;

import ernesto.design.patterns.factory.ingredients.PizzaIngredientsFactory;

public class CheesePizza extends Pizza {

	PizzaIngredientsFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientsFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese= ingredientFactory.createCheese();
	}

}
