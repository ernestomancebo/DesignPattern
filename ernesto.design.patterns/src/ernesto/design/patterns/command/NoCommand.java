package ernesto.design.patterns.command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Slot without command!");
	}

}
