package patterns.facade.concretefacade;

import patterns.facade.facade.AbstractFacade;

public class SubFacade extends AbstractFacade {
    @Override
    public void turnOnAllSubSystemObjects() {
        subSystemObject1.on();
        subSystemObject2.on();
        subSystemObject3.on();
    }

    @Override
    public void turnOffAllSubSystemObjects() {
        subSystemObject1.off();
        subSystemObject2.off();
        subSystemObject3.off();
    }
}
