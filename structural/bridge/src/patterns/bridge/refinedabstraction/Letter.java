package patterns.bridge.refinedabstraction;

import patterns.bridge.abstraction.Abstraction;
import patterns.bridge.implementor.Implementor;

public class Letter extends Abstraction {

    public Letter(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void whatLetterAmI() {
        this.implementor.getLetter();
    }
}
