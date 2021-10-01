package patterns.abstractfactory.factoryprovider;

import patterns.abstractfactory.abstractfactory.AbstractFactory;
import patterns.abstractfactory.concretefactory.ConsonantFactory;
import patterns.abstractfactory.concretefactory.VowelsFactory;
import patterns.abstractfactory.factoryprovider.constant.FactoryType;

import java.util.Optional;

public interface FactoryProvider {
    static Optional<AbstractFactory<?>> factoryMethod(FactoryType factoryType){
        if (Optional.ofNullable(factoryType).isPresent()) {
            switch (factoryType) {
                case CONSONANT_FACTORY:
                    return Optional.of(new ConsonantFactory());
                case VOWELS_FACTORY:
                    return Optional.of(new VowelsFactory());
            }
        }
        return Optional.empty();
    }
}
