package patterns.facade.facade;

import patterns.facade.subsystem.Abstraction;
import patterns.facade.subsystem.SubSystemObject1;
import patterns.facade.subsystem.SubSystemObject2;
import patterns.facade.subsystem.SubSystemObject3;

public abstract class AbstractFacade {
    protected Abstraction subSystemObject1;
    protected Abstraction subSystemObject2;
    protected Abstraction subSystemObject3;

    public AbstractFacade() {
        this.subSystemObject1 = new SubSystemObject1();
        this.subSystemObject2 = new SubSystemObject2();
        this.subSystemObject3 = new SubSystemObject3();
    }
    public abstract void turnOnAllSubSystemObjects();
    public abstract void turnOffAllSubSystemObjects();
}
