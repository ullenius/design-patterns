package patterns.visitor.concreteelement;

import patterns.visitor.element.Visitable;
import patterns.visitor.visitor.Visitor;

public class ConcreteElementA implements Visitable {

    private int anInt;

    public ConcreteElementA(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getAnInt() {
        return anInt;
    }
}
