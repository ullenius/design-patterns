package patterns.singelton.enumeration;

public enum EnumSingelton {
    INSTANCE;

    private int count;

    private EnumSingelton() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
