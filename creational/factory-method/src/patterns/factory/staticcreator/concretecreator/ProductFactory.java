package patterns.factory.staticcreator.concretecreator;

import patterns.factory.staticcreator.concreteproduct.ProductA;
import patterns.factory.staticcreator.concreteproduct.ProductB;
import patterns.factory.staticcreator.concreteproduct.ProductNull;
import patterns.factory.staticcreator.product.Product;

public interface ProductFactory {
    static Product factoryMethod(String product) {
        if (product != null) {
            switch (product.toUpperCase()) {
                case "PRODUCT_A":
                    return new ProductA();
                case "PRODUCT_B":
                    return new ProductB();
                default:
                    // Null Object Pattern
                    return new ProductNull();
            }
        }
        // Null Object Pattern
        return new ProductNull();
    }
}
