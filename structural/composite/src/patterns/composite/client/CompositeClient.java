package patterns.composite.client;

import patterns.composite.component.Component;
import patterns.composite.composite.Composite;
import patterns.composite.concretecomposite.ConreteComposite;
import patterns.composite.concreteleaf.ConcreteLeaf;
import patterns.composite.leaf.Leaf;

import java.util.ArrayList;
import java.util.List;

public class CompositeClient {
    public static void main(String[] args) {
        Leaf leaf1 = new ConcreteLeaf();
        Leaf leaf2 = new ConcreteLeaf();
        Leaf leaf3 = new ConcreteLeaf();

        Composite composite = new ConreteComposite(new ArrayList<>());
        composite.addLeaf(leaf1);
        composite.addLeaf(leaf2);
        composite.addLeaf(leaf3);

        Leaf leaf = composite.getLeaf(0);
        leaf.leafBehaviour();
        leaf.componentBehaviour();

        composite.componentBehaviour();
        composite.compositeBehaviour();
        composite.printLeafs();
        System.out.println();

        List<Component> components = new ArrayList<>();
        components.add(leaf1);
        components.add(leaf2);
        components.add(leaf3);
        components.add(composite);
        components.forEach(Component::componentBehaviour);

    }
}
