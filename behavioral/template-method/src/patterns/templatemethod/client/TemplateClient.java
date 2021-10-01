package patterns.templatemethod.client;

import patterns.templatemethod.concretetemplate.ConcreteTemplateA;
import patterns.templatemethod.concretetemplate.ConcreteTemplateB;
import patterns.templatemethod.template.AbstractTemplate;

public class TemplateClient {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplateA(25,true);
        template.templateMethod();

        System.out.println();

        template = new ConcreteTemplateB(4, false);
        template.templateMethod();
    }
}
