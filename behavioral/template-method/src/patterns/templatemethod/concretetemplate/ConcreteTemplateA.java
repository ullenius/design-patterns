package patterns.templatemethod.concretetemplate;

import patterns.templatemethod.template.AbstractTemplate;

public class ConcreteTemplateA extends AbstractTemplate {

    public ConcreteTemplateA(int anInt, boolean aBoolean) {
        super(anInt, aBoolean);
    }

    @Override
    protected void primitiveOperation1() {
        System.out.println("Primitive operation 1 is doing its job in : " + getClass().getSimpleName());
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Primitive operation 2 is doing its job in : " + getClass().getSimpleName());
    }
}
