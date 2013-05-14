package ernesto.design.patterns.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend(String size) {
		description = "House Blend Coffee";
		setSize(size);
	}
	
	@Override
	public double cost() {
		return 0.89;
	}
	
}
