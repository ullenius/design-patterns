package patterns.mvc.model;

public class Model {
    private String name;
    private int price;

    public Model(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
