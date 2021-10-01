package patterns.bridge.concreteimplementor;

import patterns.bridge.implementor.Implementor;

public class B implements Implementor {
    @Override
    public void getLetter() {
        System.out.println(getClass().getSimpleName());
    }
}
