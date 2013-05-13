package ernesto.design.patterns.beggin;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior   = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("Soy tu real Mallard Duck");
	}

}
