package patterns.copymethod;

import java.util.Date;

public class Javaprogrammer implements Copyable<Javaprogrammer> {
    private String name;
    private int salary;
    private Date date;

    public Javaprogrammer(String name, int salary, Date date) {
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public Javaprogrammer(Javaprogrammer javaprogrammer) {
        this.name = javaprogrammer.name;
        this.salary = javaprogrammer.salary;
        this.date = new Date(javaprogrammer.date.getTime());
    }

    @Override
    public Javaprogrammer copy() {
        return new Javaprogrammer(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}
