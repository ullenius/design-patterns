package patterns.iterator.concreteiterator;

import patterns.iterator.iterator.Iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {

    private List<?> list;
    private int pos = 0;

    public <T> ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return pos < list.size() && list.get(pos) != null;
    }

    @Override
    public Object next() {
        Object item = list.get(pos);
        pos += 1;
        return item;
    }
}
