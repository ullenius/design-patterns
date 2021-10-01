package patterns.builder.gangoffour.client;

import patterns.builder.gangoffour.builder.EntityBuilder;
import patterns.builder.gangoffour.concretebuilder.ConcreteEntityBuilder;
import patterns.builder.gangoffour.director.Director;
import patterns.builder.gangoffour.product.Entity;

import java.awt.*;

public class GangOfFourBuilderClient {
    public static void main(String[] args) {
        EntityBuilder builder = new ConcreteEntityBuilder();

        Director director = new Director(builder);
        director.buildString("Stockholm");
        director.buildInt(255);
        director.buildLocation(new Point(47,-59));

        Entity entity = director.build();
        System.out.println(entity);
    }
}
