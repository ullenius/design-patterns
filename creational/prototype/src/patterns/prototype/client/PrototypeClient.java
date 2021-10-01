package patterns.prototype.client;

import patterns.prototype.conreteprototype.A;
import patterns.prototype.conreteprototype.AbstractLetter;
import patterns.prototype.conreteprototype.B;

import java.util.ArrayList;
import java.util.List;

public class PrototypeClient {
    public static void main(String[] args)  {
        List<AbstractLetter> letters = new ArrayList<>();
        letters.add(new A("A"));
        letters.add(new B("B"));
        letters.add(new A("AA"));
        letters.add(new B("BB"));
        letters.add(new A("AAA"));
        letters.add(new B("BBB"));

        List<AbstractLetter> copies = new ArrayList<>();
        letters.forEach(letter -> copies.add(letter.clone()));
        copies.stream().map(AbstractLetter::getState).forEach(System.out::println);
    }
}
