package patterns.singelton.doublelocking;

public class DoubleCheckedLockingSingelton {
    private volatile static DoubleCheckedLockingSingelton instance;
    private DoubleCheckedLockingSingelton() {

    }
    public static DoubleCheckedLockingSingelton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingelton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingelton();
                }
            }
        }
        return instance;
    }
}
