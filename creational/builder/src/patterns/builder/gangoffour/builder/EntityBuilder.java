package patterns.builder.gangoffour.builder;

import patterns.builder.gangoffour.product.Entity;

import java.awt.*;

public interface EntityBuilder {
    void buildString(String string);

    void buildInt(int anInt);

    void buildLocation(Point location);

    Entity getEntity();
}
