package ernesto.design.patterns.decorator;

public class Soy extends CondimentDectorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		setSize(beverage.getSize());
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		if(beverage.getSize().equalsIgnoreCase("tall")) {
			return 0.10 + beverage.cost();
		} else if(beverage.getSize().equalsIgnoreCase("venti")) {			
			return 0.20 + beverage.cost();
		} else {
			return 0.15 + beverage.cost();
		}
	}

}
