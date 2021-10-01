package patterns.dependency.inversion;

public class InversionClient {
    public static void main(String[] args) {
        Hamburger veggieBurger = new VeggieBurger(4,1);
        Hamburger meatBurger = new MeatBurger(5,2);

        Order order = new Order(veggieBurger);
        order.makeBurger();

        order = new Order(meatBurger);
        order.makeBurger();
    }
}
abstract class Hamburger {
    private int price;
    private int size;

    public Hamburger(int price, int size) {
        this.price = price;
        this.size = size;
    }
}
class VeggieBurger extends Hamburger {
    public VeggieBurger(int price, int size) {
        super(price, size);
    }
}
class MeatBurger extends Hamburger {
    public MeatBurger(int price, int size) {
        super(price, size);
    }
}
// Order class is only relying on a interface/abstraction dependency in its member and constructor.
// Any hamburger can be passed into its params.
class Order {
    private Hamburger hamburger;
    public Order(Hamburger hamburger) {
        this.hamburger = hamburger;
    }
    void makeBurger() {
        System.out.println(hamburger.getClass().getSimpleName() + " is being made");
    }
}


