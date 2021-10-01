package patterns.visitor.visitor;

import patterns.visitor.concreteelement.ConcreteElementA;
import patterns.visitor.concreteelement.ConcreteElementB;

public interface Visitor {
    void visit(ConcreteElementA concreteElementA);
    void visit(ConcreteElementB concreteElementB);
}
