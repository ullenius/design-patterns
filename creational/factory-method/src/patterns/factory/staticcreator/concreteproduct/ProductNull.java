package patterns.factory.staticcreator.concreteproduct;

import patterns.factory.staticcreator.product.Product;

public class ProductNull implements Product {
    @Override
    public void doSomething() {
        // do nothing
    }
}
