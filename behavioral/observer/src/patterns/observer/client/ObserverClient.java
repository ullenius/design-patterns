package patterns.observer.client;

import patterns.observer.concreteobserver.ObserverImpl;
import patterns.observer.concretesubject.SubjectImpl;
import patterns.observer.subject.Subject;

public class ObserverClient {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        subject.register(new ObserverImpl("Observer n.1"));
        subject.register(new ObserverImpl("Observer n.2"));
        subject.register(new ObserverImpl("Observer n.3"));
        subject.register(new ObserverImpl("Observer n.4"));

        subject.setState("The new state is set!");

    }
}
