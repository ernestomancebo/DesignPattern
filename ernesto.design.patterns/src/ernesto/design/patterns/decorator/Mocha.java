package ernesto.design.patterns.decorator;

public class Mocha extends CondimentDectorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		setSize(beverage.getSize());
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		if(beverage.getSize().equalsIgnoreCase("tall")) {
			return 0.15 + beverage.cost();
		} else if(beverage.getSize().equalsIgnoreCase("venti")) {		
			return 0.25 + beverage.cost();
		} else{
			return 0.20 + beverage.cost();
		}
	}

}
