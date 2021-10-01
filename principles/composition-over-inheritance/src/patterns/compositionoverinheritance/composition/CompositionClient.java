package patterns.compositionoverinheritance.composition;

public class CompositionClient {
    public static void main(String[] args) {
        Car car = new Car(new Wheels(4));
    }
}
// Car cannot be created without its Wheels
// Car HAS-A Composition relationship with Wheels.
class Car {
    Wheels wheels;

    public Car(Wheels wheels) {
        this.wheels = wheels;
    }
}

class Wheels {
    int wheels;

    public Wheels(int wheels) {
        this.wheels = wheels;
    }
}
