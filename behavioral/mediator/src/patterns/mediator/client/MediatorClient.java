package patterns.mediator.client;

import patterns.mediator.colleague.Colleague;
import patterns.mediator.concretecolleague.ColleagueImpl;
import patterns.mediator.concretemediator.MediatorImpl;
import patterns.mediator.mediator.Mediator;

public class MediatorClient {
    public static void main(String[] args) {

        Mediator mediator = new MediatorImpl();

        Colleague colleague1 = new ColleagueImpl("Erik", mediator);
        Colleague colleague2 = new ColleagueImpl("Matheo", mediator);
        Colleague colleague3 = new ColleagueImpl("Elise", mediator);
        Colleague colleague4 = new ColleagueImpl("Nico", mediator);
        Colleague colleague5 = new ColleagueImpl("Joe", mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);
        mediator.addColleague(colleague3);
        mediator.addColleague(colleague4);
        mediator.addColleague(colleague5);

        colleague3.send("Hey everybody! What's up?");
    }
}
