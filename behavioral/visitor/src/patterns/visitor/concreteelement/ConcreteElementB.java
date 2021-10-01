package patterns.visitor.concreteelement;

import patterns.visitor.element.Visitable;
import patterns.visitor.visitor.Visitor;

public class ConcreteElementB implements Visitable {

    private String string;

    public ConcreteElementB(String string) {
        this.string = string;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getString() {
        return string;
    }
}
