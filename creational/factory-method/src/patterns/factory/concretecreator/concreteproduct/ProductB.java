package patterns.factory.concretecreator.concreteproduct;

import patterns.factory.concretecreator.product.Product;

public class ProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println(getClass().getSimpleName());
    }
}
