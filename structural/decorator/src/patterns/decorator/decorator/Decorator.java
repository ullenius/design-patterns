package patterns.decorator.decorator;

import patterns.decorator.component.Component;

public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void readXML();
}
