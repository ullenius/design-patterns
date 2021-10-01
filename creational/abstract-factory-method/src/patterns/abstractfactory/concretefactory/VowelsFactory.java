package patterns.abstractfactory.concretefactory;

import patterns.abstractfactory.abstractfactory.AbstractFactory;
import patterns.abstractfactory.concreteproduct.vowel.A;
import patterns.abstractfactory.concreteproduct.vowel.E;
import patterns.abstractfactory.product.Vowel;

import java.util.Optional;

public class VowelsFactory implements AbstractFactory<Vowel> {

    @Override
    public Optional<Vowel> factoryMethod(String type) {
        if (Optional.ofNullable(type).isPresent()) {
            switch (type.toUpperCase()) {
                case "A":
                    return Optional.of(new A());
                case "E":
                    return Optional.of(new E());
            }
        }
        return Optional.empty();
    }
}
