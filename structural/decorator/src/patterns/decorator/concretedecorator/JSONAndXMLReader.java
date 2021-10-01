package patterns.decorator.concretedecorator;

import patterns.decorator.component.Component;
import patterns.decorator.decorator.Decorator;

public class JSONAndXMLReader extends Decorator {

    public JSONAndXMLReader(Component component) {
        super(component);
    }

    @Override
    public void readXML() {
        System.out.println("Reading XML...");
    }

    @Override
    public void readJSON() {
        component.readJSON();
    }
}
