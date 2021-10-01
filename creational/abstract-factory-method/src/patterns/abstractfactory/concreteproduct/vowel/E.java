package patterns.abstractfactory.concreteproduct.vowel;

import patterns.abstractfactory.product.Vowel;

public class E implements Vowel {
    @Override
    public void doSomething() {
        System.out.println(getClass().getSimpleName() + " is a " + Vowel.class.getSimpleName());
    }
}
