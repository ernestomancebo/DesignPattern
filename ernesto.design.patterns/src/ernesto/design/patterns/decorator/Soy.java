package ernesto.design.patterns.decorator;

public class Soy extends CondimentDectorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

}
