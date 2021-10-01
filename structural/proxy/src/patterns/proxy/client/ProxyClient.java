package patterns.proxy.client;


import patterns.proxy.proxy.Proxy;
import patterns.proxy.realsubject.RealSubject;
import patterns.proxy.subject.Subject;

public class ProxyClient {
    public static void main(String[] args) {
        Subject proxySubject = new Proxy(new RealSubject());

        proxySubject.accept(4);
        proxySubject.accept(1);
    }
}
