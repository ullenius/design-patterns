package patterns.abstractfactory.client;

import patterns.abstractfactory.abstractfactory.AbstractFactory;
import patterns.abstractfactory.factoryprovider.FactoryProvider;
import patterns.abstractfactory.factoryprovider.constant.FactoryType;
import patterns.abstractfactory.product.Consonant;
import patterns.abstractfactory.product.Vowel;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AbstractFactoryClient {

    public static void main(String[] args) {
        Optional<AbstractFactory<?>> vowelFactory = FactoryProvider.factoryMethod(FactoryType.VOWELS_FACTORY);
        Optional<AbstractFactory<?>> consonantFactory = FactoryProvider.factoryMethod(FactoryType.CONSONANT_FACTORY);

        Optional<?> optionalA = vowelFactory.flatMap(factory -> factory.factoryMethod("A"));
        Optional<?> optionalE = vowelFactory.flatMap(factory -> factory.factoryMethod("E"));
        Optional<?> optionalG = vowelFactory.flatMap(factory -> factory.factoryMethod("X"));

        List<Vowel> vowels = Stream.of(optionalA,optionalE,optionalG)
                .filter(Optional::isPresent)
                .map(o -> (Vowel)o.get())
                .collect(Collectors.toList());


        Optional<?> optionalY = consonantFactory.flatMap(factory -> factory.factoryMethod("Y"));
        Optional<?> optionalZ = consonantFactory.flatMap(factory -> factory.factoryMethod("Z"));
        Optional<?> optionalX = consonantFactory.flatMap(factory -> factory.factoryMethod("X"));

        List<Consonant> consonants = Stream.of(optionalY,optionalZ,optionalX)
                .filter(Optional::isPresent)
                .map(o -> (Consonant)o.get())
                .collect(Collectors.toList());

        vowels.forEach(Vowel::doSomething);
        consonants.forEach(Consonant::doSomething);

    }

}



