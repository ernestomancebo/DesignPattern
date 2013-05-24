package ernesto.design.patterns.command;

public class GarageDoorOpenCommand implements Command {

	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.up();
		garageDoor.lightOn();
	}

}
