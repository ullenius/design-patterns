package patterns.abstractfactory.concretefactory;

import patterns.abstractfactory.abstractfactory.AbstractFactory;
import patterns.abstractfactory.concreteproduct.consonant.X;
import patterns.abstractfactory.concreteproduct.consonant.Z;
import patterns.abstractfactory.product.Consonant;

import java.util.Optional;

public class ConsonantFactory implements AbstractFactory<Consonant> {

    @Override
    public Optional<Consonant> factoryMethod(String type) {
        if (Optional.ofNullable(type).isPresent()) {
            switch (type.toUpperCase()) {
                case "X":
                    return Optional.of(new X());
                case "Z":
                    return Optional.of(new Z());
            }
        }
        return Optional.empty();
    }
}
