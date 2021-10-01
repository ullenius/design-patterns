package patterns.adapter.adaptee;

public class Adaptee implements AdapteeInterface {
    @Override
    public void doSomething() {
        System.out.println("I'm doing something!");
    }
}
