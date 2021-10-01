package patterns.command.receiver;

public class ReceiverImpl implements Receiver  {

    @Override
    public void getA() { System.out.println("A"); }

    @Override
    public void getB() {
        System.out.println("B");
    }
}
