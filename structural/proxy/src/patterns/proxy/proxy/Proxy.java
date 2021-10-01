package patterns.proxy.proxy;

import patterns.proxy.subject.Subject;

public class Proxy implements Subject {
    private Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void accept(int accessLevel) {
        if (accessLevel != 1) {
            System.out.println("Permission denied...");
        } else {
            realSubject.accept(accessLevel);
        }
    }
}
