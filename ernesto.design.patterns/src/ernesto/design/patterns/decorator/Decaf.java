package ernesto.design.patterns.decorator;

public class Decaf extends Beverage {

	public Decaf(String size) {
		description = "Decaf coffee";
		setSize(size);
	}
	
	@Override
	public double cost() {
		return 1.05;
	}
	
}
