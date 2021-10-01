package patterns.bridge.concreteimplementor;

import patterns.bridge.implementor.Implementor;

public class A implements Implementor {
    @Override
    public void getLetter() {
        System.out.println(getClass().getSimpleName());
    }
}
