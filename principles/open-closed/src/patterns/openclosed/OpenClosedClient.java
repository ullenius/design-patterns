package patterns.openclosed;

public class OpenClosedClient {
    public static void main(String[] args) {
        Extendable extendableA = new A();
        Extendable extendableB = new B();
        doSomething(extendableA);
        doSomething(extendableB);
    }

    // doSomething method does never have to be changed
    static void doSomething(Extendable extendable) {
        extendable.open();
        extendable.close();
        extendable.read();
        extendable.write();
    }
}
// By using abstraction Extendable's behaviour can be used by any implementation
interface Extendable {
    void read();
    void write();
    void close();
    void open();
}

class A implements Extendable {
    @Override
    public void read() {}

    @Override
    public void write() {}

    @Override
    public void close() {}

    @Override
    public void open() {}
}

class B implements Extendable {
    @Override
    public void read() {}

    @Override
    public void write() {}

    @Override
    public void close() {}

    @Override
    public void open() {}
}

