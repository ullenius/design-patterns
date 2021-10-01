package patterns.memento.client;

import patterns.memento.caretaker.Caretaker;
import patterns.memento.originator.Originator;

public class MementoClient {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("The first state");
        caretaker.add(originator.saveState());

        originator.setState("The second state");
        caretaker.add(originator.saveState());

        originator.restoreState(caretaker.get(0));
        // Now current state is back to the first saved state.
        System.out.println(originator.getCurrentState());

    }
}
