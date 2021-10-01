package patterns.factory.abstractcreator.client;

import patterns.factory.abstractcreator.concretecreator.ProductAFactory;
import patterns.factory.abstractcreator.concretecreator.ProductBFactory;
import patterns.factory.abstractcreator.creator.Creator;
import patterns.factory.abstractcreator.product.Product;

public class AbstractCreatorClient {
    public static void main(String[] args) {
        Creator aFactory = new ProductAFactory();
        Creator bFactory = new ProductBFactory();

        Product a = aFactory.getProduct();
        Product b = bFactory.getProduct();

        a.doSomething();
        b.doSomething();
    }
}
