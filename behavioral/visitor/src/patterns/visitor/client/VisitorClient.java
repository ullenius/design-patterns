package patterns.visitor.client;

import patterns.visitor.concreteelement.ConcreteElementA;
import patterns.visitor.concreteelement.ConcreteElementB;
import patterns.visitor.concretevisitor.ConcreteVisitorA;
import patterns.visitor.concretevisitor.ConcreteVisitorB;
import patterns.visitor.element.Visitable;
import patterns.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorClient {
    public static void main(String[] args) {
        List<Visitable> visitables = new ArrayList<>(); // The Object Structure
        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();

        visitables.add(new ConcreteElementA(25));
        visitables.add(new ConcreteElementB("String"));

        visitables.forEach(visitable -> visitable.accept(visitorA));
        System.out.println();
        visitables.forEach(visitable -> visitable.accept(visitorB));

    }
}
