package ernesto.design.patterns.factory;

import ernesto.design.patterns.factory.pizza.Pizza;

public class PizzaTestDrive {

		public static void main(String[] args) {
			PizzaStore nyP = new NYPizzaSotre();
			PizzaStore chP = new ChiPizzaStore();
			
			Pizza pizza;
						
			pizza = nyP.orderPizza("cheese");
			System.out.println("Ernesto ordered " + pizza.getName() + "\n");
			
			pizza = chP.orderPizza("pepperoni");
			System.out.println("Laura ordered " + pizza.getName() + "\n");
		}
}
