package patterns.command.command;

import patterns.command.receiver.Receiver;

public class ACommand implements Command {

    private Receiver receiver;

    public ACommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.getA();
    }
}
