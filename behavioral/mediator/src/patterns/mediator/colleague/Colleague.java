package patterns.mediator.colleague;

import patterns.mediator.mediator.Mediator;

public abstract class Colleague {

    protected String name;
    protected Mediator mediator;

    public Colleague(String name,Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void receive(String msg);

    public abstract void send(String msg);

    public String getName() {
        return name;
    }
}
