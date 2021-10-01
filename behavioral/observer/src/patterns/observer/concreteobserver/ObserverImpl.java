package patterns.observer.concreteobserver;

import patterns.observer.observer.Observer;

public class ObserverImpl implements Observer {

    private String name;
    private String state;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String subjectState) {
        this.state = subjectState;
        System.out.printf("Observer %s recevied the new update : %s%n",name,state);
    }

    public String getState() {
        return state;
    }
}
