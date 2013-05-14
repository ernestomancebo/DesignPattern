package ernesto.design.patterns.decorator;

public class StarbuzzCofee {

	public static void main(String[] args) {
//		Beverage beverage1 = new Espresso();
//		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
//		
//		Beverage beverage2 = new DarkRoast();
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Whip(beverage2);
//		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend("tall");
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		beverage3 = new Soy(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		beverage3 = new Mocha(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		beverage3 = new SteamedMilk(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}

}
