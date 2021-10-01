package patterns.mediator.mediator;

import patterns.mediator.colleague.Colleague;

public interface Mediator {
    void addColleague(Colleague colleague);

    void broadcast(String msg,Colleague colleague);
}
