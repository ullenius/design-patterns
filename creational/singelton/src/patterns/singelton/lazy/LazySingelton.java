package patterns.singelton.lazy;

public class LazySingelton {
    private static LazySingelton instance;
    private String dummyData = "Hello Default Data";

    private LazySingelton() {
    }

    public static LazySingelton getInstance() {
        if (instance == null) {
            instance =  new LazySingelton();
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
