package patterns.state.context;

import patterns.state.state.State;

public class Context {

    private State state;

    // The initial state
    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}
