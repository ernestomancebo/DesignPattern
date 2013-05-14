package ernesto.design.patterns.decorator;

public class Espresso extends Beverage {

	public Espresso(String size) {
		description = "Espresso";
		setSize(size);
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
	
}
