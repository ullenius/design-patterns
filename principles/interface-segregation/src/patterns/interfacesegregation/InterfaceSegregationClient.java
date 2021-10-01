package patterns.interfacesegregation;

public class InterfaceSegregationClient {
    public static void main(String[] args) {

    }
}

// Small interfaces created with behaviour for just that task.
interface SmallA {
    void doSomethingSmallA();
}

interface SmallB {
    void doSomethingSmallB();
}
// Classes can implement small-interfaces according to what task they need to do.
class X implements SmallA, SmallB {

    @Override
    public void doSomethingSmallA() {

    }

    @Override
    public void doSomethingSmallB() {

    }
}

class Y implements SmallB {

    @Override
    public void doSomethingSmallB() {

    }
}
