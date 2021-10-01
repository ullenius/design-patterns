package patterns.mediator.concretemediator;

import patterns.mediator.colleague.Colleague;
import patterns.mediator.mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
    private List<Colleague> colleagues;

    public MediatorImpl() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void broadcast(String msg, Colleague colleague) {
        colleagues.forEach(colleague1 -> {
            if (!colleague1.equals(colleague)) {
                colleague1.receive(msg.concat(" from : "+ colleague.getName()));
            }
        });
    }
}
