package patterns.factory.concretecreator.concretecreator;

import patterns.factory.concretecreator.concretecreator.constants.ProductType;
import patterns.factory.concretecreator.concreteproduct.ProductA;
import patterns.factory.concretecreator.concreteproduct.ProductB;
import patterns.factory.concretecreator.concreteproduct.ProductNull;
import patterns.factory.concretecreator.product.Product;

public class ProductFactory {
    public Product factoryMethod(ProductType productType) {
        // Here for creation a if-else chain or a switch case can be used.
        if (productType != null) {
            switch (productType) {
                case PRODUCT_A:
                    return new ProductA();
                case PRODUCT_B:
                    return new ProductB();
            }
        }
            // Null object-pattern
            return new ProductNull();
        }
    }
