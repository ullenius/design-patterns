package patterns.factory.abstractcreator.concretecreator;

import patterns.factory.abstractcreator.concreteproduct.ProductA;
import patterns.factory.abstractcreator.creator.Creator;
import patterns.factory.abstractcreator.product.Product;

public class ProductAFactory extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ProductA();
    }
}
