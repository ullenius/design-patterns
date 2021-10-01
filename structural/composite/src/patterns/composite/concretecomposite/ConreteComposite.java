package patterns.composite.concretecomposite;

import patterns.composite.component.Component;
import patterns.composite.composite.Composite;
import patterns.composite.leaf.Leaf;

import java.util.List;

public class ConreteComposite implements Composite {
    private List<Leaf> leafs;

    public ConreteComposite(List<Leaf> leafs) {
        this.leafs = leafs;
    }
    @Override
    public void componentBehaviour() {
        System.out.println("Composite is doing something Component-specific");
    }
    @Override
    public void addLeaf(Leaf leaf) {
        leafs.add(leaf);
    }
    @Override
    public void removeLeaf(Leaf leaf) {
        leafs.remove(leaf);
    }
    @Override
    public Leaf getLeaf(int index) {
        return leafs.get(index);
    }
    @Override
    public void printLeafs() {
        leafs.forEach(Leaf::leafBehaviour);
    }
    @Override
    public void compositeBehaviour() {
        System.out.println("Composite is doing something Composite-specific");
    }
}
