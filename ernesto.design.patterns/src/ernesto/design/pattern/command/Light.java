package ernesto.design.pattern.command;

public class Light {
	
	private String place;
	
	public Light() {
		this.place = "";
	}
	
	public Light(String place) {
		this.place = place;
	}
	
	public void on() {
		System.out.println(place + " Light is on");
	}

	
	public void off() {
		System.out.println(place + " Light is off");
	}
	
}
