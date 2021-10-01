package patterns.abstractfactory.abstractfactory;

import java.util.Optional;

public interface AbstractFactory<T> {
    Optional<T> factoryMethod(String type);
}
