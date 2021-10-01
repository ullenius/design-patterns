package patterns.builder.gangoffour.director;

import patterns.builder.gangoffour.builder.EntityBuilder;
import patterns.builder.gangoffour.product.Entity;

import java.awt.*;

public class Director {
    private EntityBuilder entityBuilder;

    public Director(EntityBuilder entityBuilder) {
        this.entityBuilder = entityBuilder;
    }

    public void buildString(String string) {
        entityBuilder.buildString(string);
    }

    public void buildInt(int anInt) {
        entityBuilder.buildInt(anInt);
    }

    public void buildLocation(Point location) {
        entityBuilder.buildLocation(location);
    }

    public Entity build() {
        return entityBuilder.getEntity();
    }
}
