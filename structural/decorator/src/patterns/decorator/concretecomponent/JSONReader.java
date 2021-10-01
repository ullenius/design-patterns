package patterns.decorator.concretecomponent;

import patterns.decorator.component.Component;

public class JSONReader implements Component {
    @Override
    public void readJSON() {
        System.out.println("Reading JSON...");
    }
}
