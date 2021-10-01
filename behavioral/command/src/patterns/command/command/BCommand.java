package patterns.command.command;


import patterns.command.receiver.Receiver;

public class BCommand implements Command {

    private Receiver receiver;

    public BCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.getB();
    }
}
