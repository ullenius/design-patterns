package patterns.factory.staticcreator.concreteproduct;

import patterns.factory.staticcreator.product.Product;

public class ProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println(getClass().getSimpleName());
    }
}
