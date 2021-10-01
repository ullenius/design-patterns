package patterns.state.concretestate;

import patterns.state.state.State;

public class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("Handling state: " + getClass().getSimpleName());
    }
}
