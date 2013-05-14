package ernesto.design.patterns.decorator;

public class Whip extends CondimentDectorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
