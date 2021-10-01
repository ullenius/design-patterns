package patterns.builder.effectivejava;

import java.awt.*;

public class EffectiveJavaBuilderClient {
    public static void main(String[] args) {
        Entity.Builder entityBuilder = new Entity.Builder();

        entityBuilder.setAnString("Stockholm");
        entityBuilder.setAnInt(250);
        entityBuilder.setLocation(new Point(-150, 500));

        Entity entity = entityBuilder.build();

        System.out.println(entity.getAnString());
        System.out.println(entity.getAnInt());
        System.out.println(entity.getLocation());
    }
}
