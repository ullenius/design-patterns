package patterns.factory.concretecreator.concreteproduct;

import patterns.factory.concretecreator.product.Product;

public class ProductNull implements Product {
    @Override
    public void doSomething() {
        // do nothing
    }
}
