package patterns.copyconstructor;

import java.util.Date;

public class Entity {
    private String string;
    private int anInt;
    private Date date;

    public Entity(String string, int anInt,Date date) {
        this.string = string;
        this.anInt = anInt;
        this.date = date;
    }
    // Copy Constructor
    public Entity(Entity entity) {
        this.string = entity.string;
        this.anInt = entity.anInt;
        // Shallow Copy
        this.date = entity.date;
        // Deep copy
        this.date = new Date(entity.date.getTime());
    }

    @Override
    public String toString() {
        return "Entity{" +
                "string='" + string + '\'' +
                ", anInt=" + anInt +
                ", date=" + date +
                '}';
    }
}
