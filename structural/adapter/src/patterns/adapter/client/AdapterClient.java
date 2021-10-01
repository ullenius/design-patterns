package patterns.adapter.client;

import patterns.adapter.adaptee.Adaptee;
import patterns.adapter.adaptee.AdapteeInterface;
import patterns.adapter.adapter.Adapter;
import patterns.adapter.target.Target;

public class AdapterClient {
    public static void main(String[] args) {
        AdapteeInterface adaptee = new Adaptee();

        Target adapter = new Adapter(adaptee);

        adapter.request();
    }
}
