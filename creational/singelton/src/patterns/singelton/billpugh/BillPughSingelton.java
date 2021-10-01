package patterns.singelton.billpugh;

public class BillPughSingelton {
    private static class BillPughSingeltonHelper {
        private static final BillPughSingelton instance = new BillPughSingelton();
    }
    private BillPughSingelton() {

    }
    public static BillPughSingelton getInstance() {
        return BillPughSingeltonHelper.instance;
    }
}
