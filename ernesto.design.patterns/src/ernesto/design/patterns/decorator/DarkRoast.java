package ernesto.design.patterns.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast(String size) {
		description = "Dark Roast Coffee";
		setSize(size);
	}
	
	@Override
	public double cost() {
		return 0.99;
	}
	
}
