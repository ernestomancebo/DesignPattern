package ernesto.design.patterns.command;

public class Stereo {

	public void on() {
		System.out.println("Stereo is on!");
	}
	
	public void off() {
		System.out.println("Stereo is off");
	}
	
	public void setCD(){
		System.out.println("CD is set");
	}
	
	public void setDVD() {
		System.out.println("DVD is set");
	}
	
	public void setRadio(int station) {
		System.out.println(station + " station is set");
	}
	
	public void setVolume(int volume) {
		System.out.println("Volume is " + volume);
	}

}
