package patterns.builder.gangoffour.product;

import java.awt.*;

public class Entity {
    private String string;
    private int anInt;
    private Point location;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "string='" + string + '\'' +
                ", anInt=" + anInt +
                ", location=" + location +
                '}';
    }
}
