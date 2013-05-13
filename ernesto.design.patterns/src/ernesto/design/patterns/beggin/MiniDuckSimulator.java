package ernesto.design.patterns.beggin;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		
		model.setDuckCall(new RealDuckCall());
		model.performDuckCall();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
