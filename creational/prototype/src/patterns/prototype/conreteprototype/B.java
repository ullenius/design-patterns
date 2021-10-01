package patterns.prototype.conreteprototype;

public class B extends AbstractLetter implements Cloneable {

    public B(String state) {
        super(state);
    }

    public B clone() {
        return (B) super.clone();
    }
}
