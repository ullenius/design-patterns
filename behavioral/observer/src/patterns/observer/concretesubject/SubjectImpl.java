package patterns.observer.concretesubject;

import patterns.observer.observer.Observer;
import patterns.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> observers;
    private String state;

    public SubjectImpl() {
        this.observers = new ArrayList<>();
    }

    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("State changed notifying all the Observers ::");
        observers.forEach(observer -> observer.update(getState()));
    }
}
