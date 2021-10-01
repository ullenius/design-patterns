package patterns.facade.client;

import patterns.facade.concretefacade.SubFacade;
import patterns.facade.facade.AbstractFacade;

public class FacadeClient {
    public static void main(String[] args) {
        AbstractFacade facade = new SubFacade();
        facade.turnOnAllSubSystemObjects();
        System.out.println();
        facade.turnOffAllSubSystemObjects();
    }
}
