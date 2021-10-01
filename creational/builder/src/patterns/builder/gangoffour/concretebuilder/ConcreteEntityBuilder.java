package patterns.builder.gangoffour.concretebuilder;

import patterns.builder.gangoffour.builder.EntityBuilder;
import patterns.builder.gangoffour.product.Entity;

import java.awt.*;

public class ConcreteEntityBuilder implements EntityBuilder {
    private Entity entity;

    public ConcreteEntityBuilder() {
        this.entity = new Entity();
    }

    @Override
    public void buildString(String string) {
        entity.setString(string);
    }

    @Override
    public void buildInt(int anInt) {
        entity.setAnInt(anInt);
    }

    @Override
    public void buildLocation(Point location) {
        entity.setLocation(location);
    }

    @Override
    public Entity getEntity() {
        return entity;
    }
}
