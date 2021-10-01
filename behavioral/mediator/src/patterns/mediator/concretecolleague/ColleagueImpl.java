package patterns.mediator.concretecolleague;

import patterns.mediator.colleague.Colleague;
import patterns.mediator.mediator.Mediator;

public class ColleagueImpl extends Colleague {
    public ColleagueImpl(String name, Mediator mediator) {
        super(name,mediator);
    }

    @Override
    public void receive(String msg) {
        System.out.printf("%s received the message : %s%n",name,msg);
    }

    @Override
    public void send(String msg) {
        mediator.broadcast(msg,this);
    }
}
