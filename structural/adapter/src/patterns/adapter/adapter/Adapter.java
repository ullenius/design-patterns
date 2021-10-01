package patterns.adapter.adapter;

import patterns.adapter.adaptee.AdapteeInterface;
import patterns.adapter.target.Target;

public class Adapter implements Target {
    // Following Dependency Inversion Principle.
    private AdapteeInterface adapteeInterface;

    public Adapter(AdapteeInterface adapteeInterface) {
        this.adapteeInterface = adapteeInterface;
    }

    @Override
    public void request() {
        adapteeInterface.doSomething();
    }
}
