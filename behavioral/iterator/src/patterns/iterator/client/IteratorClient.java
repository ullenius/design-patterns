package patterns.iterator.client;

import patterns.iterator.concreteaggregate.ConcreteAggregate;
import patterns.iterator.iterator.Iterator;

import java.util.Arrays;

public class IteratorClient {
    public static void main(String[] args) {

        ConcreteAggregate<Integer> aggregate = new ConcreteAggregate<>(Arrays.asList(3,4,5,6,7,8,9,10));
        Iterator iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
