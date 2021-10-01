package patterns.copymethod;

import java.util.Date;
import java.util.List;

public class JavaArchitect extends Javaprogrammer {

    private List<String> projects;

    public JavaArchitect(String name, int salary, Date date,List<String> projects) {
        super(name, salary, date);
        this.projects = projects;
    }

    public JavaArchitect(JavaArchitect javaArchitect) {
        super(javaArchitect.getName(),javaArchitect.getSalary(),javaArchitect.getDate());
        this.projects = javaArchitect.projects;
    }

    @Override
    public Javaprogrammer copy() {
        return new JavaArchitect(this);
    }

    public List<String> getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        return "{" +
                "projects=" + projects +
                "} " + super.toString();
    }
}
