package patterns.factory.staticcreator.client;

import patterns.factory.staticcreator.concretecreator.ProductFactory;
import patterns.factory.staticcreator.product.Product;

public class StaticCreatorClient {
    public static void main(String[] args) {
        Product a = ProductFactory.factoryMethod("pRoduct_a");
        Product b = ProductFactory.factoryMethod("PRODUCT_B");
        a.doSomething();
        b.doSomething();

        Product nullObject = ProductFactory.factoryMethod(null);
        System.out.println(nullObject.getClass().getSimpleName());
        nullObject = ProductFactory.factoryMethod("something completely different");
        System.out.println(nullObject.getClass().getSimpleName());
    }
}
