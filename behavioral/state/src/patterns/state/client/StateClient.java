package patterns.state.client;

import patterns.state.concretestate.ConcreteStateA;
import patterns.state.concretestate.ConcreteStateB;
import patterns.state.context.Context;

public class StateClient {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());

        context.request();

        context.setState(new ConcreteStateB());

        context.request();
    }
}
