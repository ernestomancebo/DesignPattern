package ernesto.design.patterns.factory.pizza;

public class NYStylePepperoniPizza extends Pizza {
	public NYStylePepperoniPizza() {
		name  = "NY Style Pepperoni Pizza";
		dough = "Thin Crust";
		sauce = "Marinara sauce";
		toppings.add("Lot of Sliced Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Garlic");
		toppings.add("Parmesan cheese");
	}
}
