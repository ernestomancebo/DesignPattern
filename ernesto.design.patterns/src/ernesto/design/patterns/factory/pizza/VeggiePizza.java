package ernesto.design.patterns.factory.pizza;

import ernesto.design.patterns.factory.ingredients.PizzaIngredientsFactory;

public class VeggiePizza extends Pizza {

	PizzaIngredientsFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientsFactory ingredientsFactory) {
		this.ingredientFactory = ingredientsFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese= ingredientFactory.createCheese();
		veggies= ingredientFactory.createVeggies();
	}

}
