package patterns.builder.effectivejava;

import java.awt.*;
// Creates a Immutable Entity Object.
public class Entity {
    private final String anString;
    private final int anInt;
    private final Point location;

    private Entity(Builder builder) {
        this.anString = builder.anString;
        this.anInt = builder.anInt;
        this.location = builder.location;
    }

    public static class Builder {
        private String anString;
        private int anInt;
        private Point location;

        public Builder setAnString(String anString) {
            this.anString = anString;
            return this;
        }

        public Builder setAnInt(int anInt) {
            this.anInt = anInt;
            return this;
        }

        public Builder setLocation(Point location) {
            this.location = location;
            return this;
        }

        public Entity build() {
            return new Entity(this);
        }
    }

    public String getAnString() {
        return anString;
    }

    public int getAnInt() {
        return anInt;
    }

    public Point getLocation() {
        return location;
    }
}
