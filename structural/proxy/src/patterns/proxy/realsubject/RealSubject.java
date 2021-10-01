package patterns.proxy.realsubject;

import patterns.proxy.subject.Subject;

public class RealSubject implements Subject {
    @Override
    public void accept(int accessLevel) {
        System.out.println("Permission granted!");
    }
}
