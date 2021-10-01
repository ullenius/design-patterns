package patterns.composite.concreteleaf;

import patterns.composite.leaf.Leaf;

public class ConcreteLeaf implements Leaf {

    @Override
    public void componentBehaviour() {
        System.out.println("Leaf is doing something Component-specific");
    }
    @Override
    public void leafBehaviour() {
        System.out.println("Leaf is doing something Leaf-specific");
    }
}
