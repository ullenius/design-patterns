package patterns.delegation;

public class DelegationClient {
    public static void main(String[] args) {
        Delegate delegate = new Delegate();
        Delegator delegator = new Delegator(delegate);
        delegator.invokeDelegateMethod();
    }
}

class Delegate {
    void delegateMethod() {
        System.out.println("Im doing a great job here!");
    }
}

class Delegator {
    Delegate delegate;

    public Delegator(Delegate delegate) {
        this.delegate = delegate;
    }
    // Delegate Principle. Shall the method name be the same or a different?
    void invokeDelegateMethod() {
        delegate.delegateMethod();
    }
}
