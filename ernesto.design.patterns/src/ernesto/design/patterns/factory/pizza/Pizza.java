package ernesto.design.patterns.factory.pizza;

import java.util.ArrayList;

import ernesto.design.patterns.factory.ingredients.Cheese;
import ernesto.design.patterns.factory.ingredients.Clams;
import ernesto.design.patterns.factory.ingredients.Dough;
import ernesto.design.patterns.factory.ingredients.Pepperoni;
import ernesto.design.patterns.factory.ingredients.Sauce;
import ernesto.design.patterns.factory.ingredients.Veggies;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	//ArrayList<String> toppings = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public abstract void prepare();

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name + " in an official PizzaStore box");
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
//		for (String topping : toppings) {
//			display.append(topping + "\n");
//		}
		return display.toString();
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
