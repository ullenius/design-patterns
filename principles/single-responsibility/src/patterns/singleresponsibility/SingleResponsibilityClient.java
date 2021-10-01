package patterns.singleresponsibility;

public class SingleResponsibilityClient {
    public static void main(String[] args) {
        Car car = new Car(new Wheels(4), new Engine(1));
        car.startCar();
    }
}
// Responsibility's are divided into smaller components.
// So the Car class doesnt have all the behaviour needed for a Car
class Car {
    Wheels wheels;
    Engine engine;

    public Car(Wheels wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    void startCar() {
        engine.start();
        wheels.spin();
    }
}

class Wheels {
    int wheels;
    public Wheels(int wheels) {
        this.wheels = wheels;
    }

    void spin() {
        System.out.println("The wheels are spinning");
    }
}

class Engine {
    int engine;
    public Engine(int engine) {
        this.engine = engine;
    }

    void start() {
        System.out.println("The engine is starting");
    }
}

