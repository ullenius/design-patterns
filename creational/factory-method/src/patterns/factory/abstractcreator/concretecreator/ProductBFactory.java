package patterns.factory.abstractcreator.concretecreator;

import patterns.factory.abstractcreator.concreteproduct.ProductB;
import patterns.factory.abstractcreator.creator.Creator;
import patterns.factory.abstractcreator.product.Product;

public class ProductBFactory extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ProductB();
    }
}
