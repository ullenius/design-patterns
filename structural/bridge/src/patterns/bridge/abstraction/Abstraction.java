package patterns.bridge.abstraction;

import patterns.bridge.implementor.Implementor;

public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void whatLetterAmI();
}
