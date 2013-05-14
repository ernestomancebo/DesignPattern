package ernesto.design.patterns.decorator;

public abstract class Beverage {
	String description = "Unkown bevarage";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
