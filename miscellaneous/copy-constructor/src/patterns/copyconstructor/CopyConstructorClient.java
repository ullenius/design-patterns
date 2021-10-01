package patterns.copyconstructor;

import java.util.Date;

public class CopyConstructorClient {
    public static void main(String[] args) {
        Entity entity = new Entity("String", 25, new Date());
        Entity copy = new Entity(entity);
        System.out.println(copy);
    }
}
