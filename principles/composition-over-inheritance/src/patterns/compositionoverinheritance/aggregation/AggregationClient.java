package patterns.compositionoverinheritance.aggregation;

public class AggregationClient {
    public static void main(String[] args) {
        CarGarage garage = new CarGarage(true);
        Car car = new Car();
        garage.parkCar(car);
    }
}
// CarGarage can be created without a Car
// CarGarage HAS-A Aggregation relationship with Car
class CarGarage {
    boolean isEmpty;
    Car car;

    public CarGarage(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    void parkCar(Car car) {
        this.car = car;
        isEmpty = false;
        car.isParked = true;
    }
}

class Car {
    boolean isParked;
}
