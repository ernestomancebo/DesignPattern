package ernesto.design.patterns.factory;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name  = "NY Style Cheese Pizza";
		dough = "Thin Crust";
		sauce = "Marinara sauce";
		toppings.add("Sliced Onion");
		toppings.add("Garlic");
		toppings.add("Lot of Parmesan cheese");
	}
}
