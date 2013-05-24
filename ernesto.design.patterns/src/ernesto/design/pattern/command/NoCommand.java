package ernesto.design.pattern.command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Slot without command!");
	}

}
