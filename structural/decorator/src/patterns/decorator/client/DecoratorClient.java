package patterns.decorator.client;

import patterns.decorator.component.Component;
import patterns.decorator.concretecomponent.JSONReader;
import patterns.decorator.concretedecorator.JSONAndXMLReader;
import patterns.decorator.decorator.Decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Component reader = new JSONReader();
        Decorator jsonAndXMLReader = new JSONAndXMLReader(reader);
        jsonAndXMLReader.readJSON();
        jsonAndXMLReader.readXML();
    }
}
