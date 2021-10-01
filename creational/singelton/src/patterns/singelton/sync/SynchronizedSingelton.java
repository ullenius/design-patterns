package patterns.singelton.sync;

public class SynchronizedSingelton {
    private static SynchronizedSingelton instance;
    private String dummyData = "Hello Default Data";

    private SynchronizedSingelton() {
    }

    public static synchronized SynchronizedSingelton getInstance() {
        if (instance == null) {
            instance =  new SynchronizedSingelton();
        }
        return instance;
    }

    public String getDummyData() {
        return dummyData;
    }

    public void setDummyData(String dummyData) {
        this.dummyData = dummyData;
    }
}
