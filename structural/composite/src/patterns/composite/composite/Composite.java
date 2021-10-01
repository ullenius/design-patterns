package patterns.composite.composite;

import patterns.composite.component.Component;
import patterns.composite.leaf.Leaf;

public interface Composite extends Component {
    void addLeaf(Leaf leaf);
    void removeLeaf(Leaf leaf);
    Leaf getLeaf(int index);
    void printLeafs();
    void compositeBehaviour();
}
