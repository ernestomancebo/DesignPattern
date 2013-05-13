package ernesto.design.patterns.beggin;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	DuckCall duckCallBehavior;
	
	public Duck() {		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performDuckCall() {
		duckCallBehavior.emmitDuckCall();
	}

	public void swim(){
		System.out.println("Patitos nadando");
	}
	
	public void setFlyBehavior(FlyBehavior flyBehav) {
		this.flyBehavior = flyBehav;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehav) {
		this.quackBehavior = quackBehav;
	}
	
	public void setDuckCall(DuckCall duckCall) {
		this.duckCallBehavior = duckCall;
	}
}
