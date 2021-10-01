package patterns.command.client;

import patterns.command.command.ACommand;
import patterns.command.command.BCommand;
import patterns.command.invoker.Invoker;
import patterns.command.receiver.Receiver;
import patterns.command.receiver.ReceiverImpl;

public class CommandClient {
    public static void main(String[] args) {

        /*
         * The Object Oriented Approach
         */
        // Create Receiver with the Client implementation
        Receiver receiver = new ReceiverImpl();
        // Create the Invoker with the ability to execute + creates the Command requested from the Client
        Invoker invoker = new Invoker(new ACommand(receiver));
        // Execute the request on demand.
        invoker.getCommand().execute();
        // Set a new Request from the Client
        invoker.setCommand(new BCommand(receiver));
        // Execute the new requested command
        invoker.getCommand().execute();
        // =================================

    }
}
