package patterns.bridge.client;

import patterns.bridge.abstraction.Abstraction;
import patterns.bridge.concreteimplementor.A;
import patterns.bridge.concreteimplementor.B;
import patterns.bridge.refinedabstraction.Letter;

public class BridgeClient {
    public static void main(String[] args) {
        Abstraction letter1 = new Letter(new A());
        Abstraction letter2 = new Letter(new B());

        letter1.whatLetterAmI();
        letter2.whatLetterAmI();
    }
}
