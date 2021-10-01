package patterns.liskovsubstitution;

public class LiskovSubstitutionClient {
    public static void main(String[] args) {
        Animal duck = new Duck();
        Animal tiger = new Tiger();

        // Duck can still be a Tiger since we are coding to the Supertype!
        // The supertype-reference can change subclass object, without any problem.
        // the eat & sleep method are still the same!
        duck = new Tiger();
    }
}
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Duck extends Animal {
    // Abstraction dont mess with this behaviour!
    @Override
    void eat() {

    }

    @Override
    void sleep() {

    }
    // Class specific behaviour
    void fly() {

    }
}

class Tiger extends Animal {

    @Override
    void eat() {

    }

    @Override
    void sleep() {

    }

    void hunt() {

    }
}
