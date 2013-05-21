package ernesto.design.patterns.factory.pizza;

public class ChiStyleCheesePizza extends Pizza {
	
	public ChiStyleCheesePizza() {
		name  = "Chicago Style Cheese Pizza";
		dough = "Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Lot of Mozzarella Cheese");
	}
 
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
