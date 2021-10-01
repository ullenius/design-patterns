package patterns.observer.subject;

import patterns.observer.observer.Observer;

public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    void setState(String state);
}
