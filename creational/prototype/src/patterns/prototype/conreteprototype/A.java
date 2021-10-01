package patterns.prototype.conreteprototype;

public class A extends AbstractLetter implements Cloneable/*The prototype member*/ {

    public A(String state) {
        super(state);
    }

    public A clone() {
        return (A) super.clone();
    }
}

