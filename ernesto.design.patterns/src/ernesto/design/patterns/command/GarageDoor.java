package ernesto.design.patterns.command;

public class GarageDoor {
	
	private Light garageLight;
	
	public GarageDoor() {
		 garageLight = new Light("Garage");
	}
	
	public void up() {
		System.out.println("Garage Door going up!");
	}
	
	public void down() {
		System.out.println("Garage Door going down!");
	}
	
	public void stop() {
		System.out.println("Garage Door stopped");
	}
	
	public void lightOn() {
		garageLight.on();
	}
	
	public void lightOff() {
		garageLight.off();
	}
	
}
