package patterns.visitor.element;

import patterns.visitor.visitor.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
