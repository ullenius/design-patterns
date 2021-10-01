package patterns.iterator.aggregate;

import patterns.iterator.iterator.Iterator;

public interface Aggregate {
    Iterator createIterator();
}
