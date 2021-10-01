package patterns.abstractfactory.concreteproduct.consonant;

import patterns.abstractfactory.product.Consonant;

public class Z implements Consonant {
    @Override
    public void doSomething() {
        System.out.println(getClass().getSimpleName() + " is a " + Consonant.class.getSimpleName());
    }
}
