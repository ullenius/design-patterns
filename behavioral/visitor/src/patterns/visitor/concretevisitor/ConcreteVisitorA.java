package patterns.visitor.concretevisitor;

import patterns.visitor.concreteelement.ConcreteElementA;
import patterns.visitor.concreteelement.ConcreteElementB;
import patterns.visitor.visitor.Visitor;

public class ConcreteVisitorA implements Visitor {

    @Override
    public void visit(ConcreteElementA concreteElementA) {
        String visitor =  concreteElementA.getClass().getSimpleName();
        String thisClass =  this.getClass().getSimpleName();
        System.out.printf("%s is visiting %s welcome!%n",visitor,thisClass);
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        String visitor =  concreteElementB.getClass().getSimpleName();
        String thisClass =  this.getClass().getSimpleName();
        System.out.printf("%s is visiting %s welcome!%n",visitor,thisClass);
    }
}
