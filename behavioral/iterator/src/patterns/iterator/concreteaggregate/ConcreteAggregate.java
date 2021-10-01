package patterns.iterator.concreteaggregate;

import patterns.iterator.aggregate.Aggregate;
import patterns.iterator.concreteiterator.ConcreteIterator;
import patterns.iterator.iterator.Iterator;

import java.util.List;

public class ConcreteAggregate<T> implements Aggregate {

    private List<T> list;

    public ConcreteAggregate(List<T> list) {
        this.list = list;
    }

    public void addItem(T type) {
        list.add(type);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(list);
    }
}
