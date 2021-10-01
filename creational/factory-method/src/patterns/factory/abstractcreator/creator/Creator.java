package patterns.factory.abstractcreator.creator;

import patterns.factory.abstractcreator.product.Product;

public abstract class Creator {
    protected abstract Product factoryMethod();

    public Product getProduct() {
        return factoryMethod();
    }
}
