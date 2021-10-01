package patterns.factory.concretecreator.client;

import patterns.factory.concretecreator.concretecreator.ProductFactory;
import patterns.factory.concretecreator.concretecreator.constants.ProductType;
import patterns.factory.concretecreator.product.Product;

public class ConcreteCreatorClient {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Product a = factory.factoryMethod(ProductType.PRODUCT_A);
        Product b = factory.factoryMethod(ProductType.PRODUCT_B);
        // Part of Null Object pattern
        Product nullObject = factory.factoryMethod(null);

        a.doSomething();
        b.doSomething();
        nullObject.doSomething();
    }
}
