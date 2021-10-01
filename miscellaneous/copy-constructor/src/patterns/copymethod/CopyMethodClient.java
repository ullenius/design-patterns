package patterns.copymethod;

import java.util.ArrayList;
import java.util.Date;

public class CopyMethodClient {
    public static void main(String[] args) {
        Javaprogrammer javaprogrammer1 = new Javaprogrammer("Mark", 2500, new Date());
        Javaprogrammer copyOfJavaprogrammer1 = new Javaprogrammer(javaprogrammer1);

        System.out.println(copyOfJavaprogrammer1);

        Javaprogrammer javaArchitect = new JavaArchitect("Mike", 3000, new Date(), new ArrayList<>());
        // To get rid of casting in the Constructor, use the Copy method!
        Javaprogrammer copyOfArchitect1 = new JavaArchitect((JavaArchitect) javaArchitect);

        Javaprogrammer copyOfArchitect2 = javaArchitect.copy();

        System.out.println(copyOfArchitect2);
    }
}
