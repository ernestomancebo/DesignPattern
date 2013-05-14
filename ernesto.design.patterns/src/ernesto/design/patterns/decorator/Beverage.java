package ernesto.design.patterns.decorator;

public abstract class Beverage {
	String description = "Unkown bevarage";
	String size = "Unkown size";
	
	public String getDescription() {
		return description;
	}

	public abstract double cost();

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
}
