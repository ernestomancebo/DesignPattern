package ernesto.design.patterns.decorator;

public class SteamedMilk extends CondimentDectorator {

	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
