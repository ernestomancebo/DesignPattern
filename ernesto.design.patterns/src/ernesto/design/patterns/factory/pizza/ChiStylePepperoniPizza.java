package ernesto.design.patterns.factory.pizza;

public class ChiStylePepperoniPizza extends Pizza {
	
	public ChiStylePepperoniPizza() {
		name  = "Chicago Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Lot of Sliced Pepperoni");
	}
 
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
