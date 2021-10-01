package patterns.memento.originator;

import patterns.memento.memento.Memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getCurrentState() {
        return state;
    }

    public Memento saveState() {
        return new Memento(state);
    }

    public void restoreState(Memento memento) {
        state = memento.getState();
    }
}
